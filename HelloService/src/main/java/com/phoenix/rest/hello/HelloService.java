package com.phoenix.rest.hello;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
/* 
 * Auther : Dharmik Maru
 * Date : 28/06/2021
 * Version : 1.0
 * Copyright : Sterlite Technologies
 * */
@Path("/hello")
public class HelloService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String SayPlainHello() {
		return "Hello Plain Text";
	}
	
	@GET
	@Path("/html")
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello() {
		return "<html><body><h2>Hello HTML Text"+"</html></body></h2>";
	}
	
	@GET
	@Path("/xml")
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return "<?xml version = \"1.0\"?>" +"<myhello> Hello XML Text" + "</myhello>";
	}

}
