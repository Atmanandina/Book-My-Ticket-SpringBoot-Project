package com.jsp.book_my_ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.book_my_ticket.entity.Screen;
import com.jsp.book_my_ticket.entity.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long>{
	
	List<Seat> findByScreenOrderBySeatRowAscSeatColumnAsc(Screen screen);

}
