package com.jsp.book_my_ticket.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jsp.book_my_ticket.entity.User;
import com.jsp.book_my_ticket.repository.UserRepository;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor //It create constructor for final variable
@Slf4j //This is used to print the statement in console for tracking purpose
public class AdminRegistration implements CommandLineRunner{
	
	@Value("${admin.email}")//Injecting values externally
	private String email;
	@Value("${admin.password}")
	private String password;

	private final UserRepository userRepo;
	@Override
	public void run(String... args) throws Exception {
		if(!userRepo.existsByEmail(email)) {//It is overcome from multiple copies in database of same type
		User user = new User(null, "ADMIN", email, 0L, AES.encrypt(password), "ADMIN",false);
		userRepo.save(user);//Saves the user data in database
		log.info("Admin Resitration sucess");
		}else {
			log.info("Admin already exists");
		}
	}

}
