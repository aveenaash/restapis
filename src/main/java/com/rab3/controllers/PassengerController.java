package com.rab3.controllers;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rab3.dtos.PassengerDto;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
	
	//@RequestMapping(value = "", method = RequestMethod.GET)
	@GetMapping(value = "")
	public PassengerDto getDummypassenger() {
		
		PassengerDto dto = new PassengerDto();
		dto.setFullName("Abc Desf");
		dto.setEmail("sde@gmail.com");
		dto.setGender("Male");
		dto.setPhone("1312431234");

		
		return dto;
		
	}
	
	
	@PostMapping(value = "")
	public void createPassenger(@RequestBody PassengerDto dto) {
		System.out.println(dto.toString());
	}
	
	

}
