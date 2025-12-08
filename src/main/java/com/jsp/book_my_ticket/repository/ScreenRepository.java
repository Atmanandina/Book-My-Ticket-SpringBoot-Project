package com.jsp.book_my_ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.book_my_ticket.entity.Screen;
import com.jsp.book_my_ticket.entity.Theater;

public interface ScreenRepository extends JpaRepository<Screen, Long>{

	List<Screen> findByTheater(Theater theater);

	boolean existsByNameAndTheater(String name, Theater theater);
}
