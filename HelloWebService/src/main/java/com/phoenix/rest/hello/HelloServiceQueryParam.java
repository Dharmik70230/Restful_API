package com.phoenix.rest.hello;

import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
/* 
 * Auther : Dharmik Maru
 * Date : 28/06/2021
 * Version : 1.0
 * Copyright : Sterlite Technologies
 * */
@Path("/queryparam")
public class HelloServiceQueryParam {
	 

	@GET
	@Path("/greet")
	@Produces("text/plain")
	public String greetUser(@QueryParam("nm") String name) {
		return "Hello " + name;
	}
	@GET
	@Path("/user")
	@Produces("text/html")
	public Response greetUserWithResponse(@QueryParam("nm") String name) {
		return Response.status(200)
				.entity("<body><h2> Hello " + name +"</body></h2>" )
				.build();
	}
	@GET
	@Path("/date")
	@Produces("text/html")
	public Response getDate(@QueryParam("dd") int day,@QueryParam("mm") int month,@QueryParam("yy") int year) {
		return Response.status(200)
				.entity("Date is : "+LocalDate.of(year, month, day))
				.build();
	}
}
