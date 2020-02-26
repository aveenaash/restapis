package com.rab3.dtos;

import java.util.List;

public class FlightDto {

	private String flightNumber;
	private String source;
	private String destination;

	private List<PassengerDto> passengers;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<PassengerDto> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<PassengerDto> passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return "FlightDto [flightNumber=" + flightNumber + ", source=" + source + ", destination=" + destination
				+ ", passengers=" + passengers + "]";
	}

}
