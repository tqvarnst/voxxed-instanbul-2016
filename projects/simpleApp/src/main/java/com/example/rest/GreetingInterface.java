package com.example.rest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.service.GreetingService;

@Path("/hello")
@RequestScoped
public class GreetingInterface {

	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject
	GreetingService service;
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHello() {
		return service.sayHello();
	}
}
