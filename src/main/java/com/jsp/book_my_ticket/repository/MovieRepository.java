package com.jsp.book_my_ticket.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.book_my_ticket.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
	boolean existsByNameAndReleaseDate(String name, LocalDate releaseDate);

	
}
