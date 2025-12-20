package com.jsp.book_my_ticket.dto;

import lombok.Data;

@Data
public class SeatRowDto {
	private String rowName;
	private Integer totalSeats;
	private String category;

}
