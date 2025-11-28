package com.jsp.book_my_ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.book_my_ticket.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	boolean existsByEmail(String email);

	void deleteByRole(String string);

	User findByEmail(String email);
	
	boolean existsByMobile(Long mobile);

}
