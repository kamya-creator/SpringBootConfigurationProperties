package com.in28minutes.microservices.limits_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limits_service.configuration.MicroserviceX;

@RestController
public class MicroserviceXController {

	@Autowired
	private MicroserviceX microserviceX;
	
	@GetMapping("/microservice-x") 
	public MicroserviceX retriveMicroServiceX()
	{
		return new MicroserviceX(microserviceX.getName(), microserviceX.getSex());
	}
}
