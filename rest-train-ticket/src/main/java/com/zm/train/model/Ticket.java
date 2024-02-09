package com.zm.train.model;

import java.time.LocalDate;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class Ticket {

	private Passenger passenger;
	private Float fare;
	private String pnrNo;
	private String ticketStatus; 
}
