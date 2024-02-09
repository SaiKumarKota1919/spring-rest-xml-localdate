package com.zm.train.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Passenger {
	@JsonProperty(value = "name")
	private String passengerName;
	private Integer trainNo;
	private String fromStation;
	private String toStation;
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	private LocalDate dateOfJourney; 

}
