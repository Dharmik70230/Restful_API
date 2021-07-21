package com.phoenix.rest.hello;

import javax.ws.rs.PathParam;

import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/* 
 * Auther : Dharmik Maru
 * Date : 28/06/2021
 * Version : 1.0
 * Copyright : Sterlite Technologies
 * */

@Path("/helloparam")
public class HelloServicePathParam {
	
	@GET
	@Path("/{nm}")
	@Produces("text/plain")
	public String greetUser(@PathParam("nm") String name) {
		return "Hello " + name;
	}
	@GET
	@Path("/user/{nm}")
	@Produces("text/html")
	public Response greetUserWithResponse(@PathParam("nm") String name) {
		return Response.status(200)
				.entity("<body><h2> Hello " + name +"</body></h2>" )
				.build();
	}
	@GET
	@Path("/date/{dd}/{mm}/{yy}")
	@Produces("text/html")
	public Response getDate(@PathParam("dd") int day,@PathParam("mm") int month,@PathParam("yy") int year) {
		return Response.status(200)
				.entity("Date is : "+LocalDate.of(year, month, day))
				.build();
	}
}
