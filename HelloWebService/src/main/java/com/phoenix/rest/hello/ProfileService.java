package com.phoenix.rest.hello;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
/* 
 * Auther : Dharmik Maru
 * Date : 28/06/2021
 * Version : 1.0
 * Copyright : Sterlite Technologies
 * */
@Path("/profile")
public class ProfileService {

	@POST
	@Path("/add")
	@Produces("text/html")
	public Response addUserProfile(@FormParam("name") String p_name,
								   @FormParam("age") String p_age,
								   @FormParam("city") String city) {
		return Response.status(200)
				.entity("<body><h2> Profile Created Successfully"
							+"<h2>Name :"+ p_name
							+"<h2>Age :"+ p_age
							+ "<h2>City :"+ city
							+"</body></h2>" )
				.build();
	}
}
