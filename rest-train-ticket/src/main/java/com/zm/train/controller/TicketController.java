package com.zm.train.controller;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zm.train.model.Passenger;
import com.zm.train.model.Ticket;

@RestController
@RequestMapping("/train")
public class TicketController {

	@PostMapping(value = "/ticket/new",consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
					produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}	)
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger)
	{
		List<String> ticketStatus = Arrays.asList("CNF","RLWL","WL","RAC");
		
		Random random = new Random();
		
		Ticket ticket = new Ticket();
		ticket.setPassenger(passenger);
		UUID uuid = UUID.randomUUID();
	
		ticket.setPnrNo(uuid.toString());
		ticket.setFare(random.nextFloat(2000,3000));
		ticket.setTicketStatus(ticketStatus.get(random.nextInt(ticketStatus.size())));
		
		
		return new ResponseEntity<>(ticket,HttpStatus.OK);
	}
	
}
