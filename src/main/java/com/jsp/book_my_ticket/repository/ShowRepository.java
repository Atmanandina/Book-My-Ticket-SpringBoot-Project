package com.jsp.book_my_ticket.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.book_my_ticket.entity.Movie;
import com.jsp.book_my_ticket.entity.Screen;
import com.jsp.book_my_ticket.entity.Show;

public interface ShowRepository extends JpaRepository<Show, Long>{
	
	List<Show> findByScreen(Screen screen);
	
	List<Show> findByShowDateAfter(LocalDate minusDays);

	List<Show> findByMovieAndShowDateAfter(Movie movie, LocalDate minusDays);
	
	boolean existsByScreen(Screen screen);

	boolean existsByMovie(Movie movie);

	List<Show> findByShowDateAndMovie(LocalDate date, Movie movie);

}
