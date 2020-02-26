package com.rab3.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rab3.dtos.FlightDto;
import com.rab3.dtos.PassengerDto;

@Service
public class FlightService {

	public FlightDto getDummyFlight() {
		FlightDto f = new FlightDto();
		f.setFlightNumber("AA-234");
		f.setSource("IAD");
		f.setDestination("ORD");
		
		List<PassengerDto> passengers = new ArrayList<PassengerDto>();
		PassengerDto p1 = new PassengerDto();
		p1.setFullName("Abc Desf");
		p1.setEmail("sde@gmail.com");
		p1.setGender("Male");
		p1.setPhone("1312431234");
		
		PassengerDto p2 = new PassengerDto();
		p2.setFullName("Xse Desf");
		p2.setEmail("aws@gmail.com");
		p2.setGender("Female");
		p2.setPhone("123356567");
		
		passengers.add(p1);
		passengers.add(p2);
		
		f.setPassengers(passengers);
		
		return f;
	}
	
	public FlightDto getDummyFlight(String flightNum) {
		FlightDto f = new FlightDto();
		f.setFlightNumber(flightNum);
		f.setSource("IAD");
		f.setDestination("ORD");
		
		List<PassengerDto> passengers = new ArrayList<PassengerDto>();
		PassengerDto p1 = new PassengerDto();
		p1.setFullName("Abc Desf");
		p1.setEmail("sde@gmail.com");
		p1.setGender("Male");
		p1.setPhone("1312431234");
		
		PassengerDto p2 = new PassengerDto();
		p2.setFullName("Xse Desf");
		p2.setEmail("aws@gmail.com");
		p2.setGender("Female");
		p2.setPhone("123356567");
		
		passengers.add(p1);
		passengers.add(p2);
		
		f.setPassengers(passengers);
		
		return f;
	}
}
