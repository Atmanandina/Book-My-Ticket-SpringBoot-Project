package com.jsp.book_my_ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.book_my_ticket.entity.Screen;
import com.jsp.book_my_ticket.entity.Show;

public interface ShowRepository extends JpaRepository<Show, Long>{
	
	List<Show> findByScreen(Screen screen);

}
