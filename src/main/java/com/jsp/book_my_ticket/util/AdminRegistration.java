package com.jsp.book_my_ticket.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jsp.book_my_ticket.entity.User;
import com.jsp.book_my_ticket.repository.UserRepository;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class AdminRegistration implements CommandLineRunner{
	
	@Value("${admin.email}")
	private String email;
	@Value("${admin.password}")
	private String password;

	private final UserRepository userRepo;
	@Override
	public void run(String... args) throws Exception {
		if(!userRepo.existsByEmail(email)) {
		User user=new User();
		user.setEmail(email);
		user.setPassword(AES.encrypt(password));
		user.setRole("ADMIN");
		user.setMobile(0000000L);
		user.setName("Admin");
		userRepo.save(user);
		log.info("Admin Resitration sucess");
		}else {
			log.info("Admin already exists");
		}
	}

}
