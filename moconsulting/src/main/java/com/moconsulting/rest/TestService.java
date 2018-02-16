package com.moconsulting.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/rest")
public class TestService {

	@GET
	@Path("/sayHello")
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHello() {

		
		return "{Hello world}"; 

	}
}