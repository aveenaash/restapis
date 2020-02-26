package com.rab3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rab3.dtos.FlightDto;
import com.rab3.services.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightController {

	private FlightService flightService;

	@GetMapping("")
	public FlightDto getFlightByNumber() {
		return flightService.getDummyFlight();
	}
	
	
	@GetMapping("/{flightnum}")
	public FlightDto getFlightByNumberPath(@PathVariable(value = "flightnum") String flightnumber) {
		return flightService.getDummyFlight(flightnumber);
	}
	

	public FlightService getFlightService() {
		return flightService;
	}

	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}
	
	

}
