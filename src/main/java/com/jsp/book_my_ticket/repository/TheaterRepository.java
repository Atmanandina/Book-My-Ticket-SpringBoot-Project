package com.jsp.book_my_ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.book_my_ticket.entity.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Long>{

	boolean existsByNameAndAddress(String name, String address);

}
