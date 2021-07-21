package com.phoenix.rest.hello;

import java.io.File;

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
@Path("/downloads")
public class DownloadService {

		@GET
		@Path("/textfile")
		@Produces("text/plain")
		public Response getTextFile() {
			
			File file = new File("D:\\Download\\hello.txt");
			
			return Response.ok(file)
					.header("Content-Disposition","attachment; filename ='hello_client.txt'")
					.build();
		}
		
		@GET
		@Path("/pdf")
		@Produces("application/pdf")
		public Response getPdf() {
			
			File file = new File("D:\\Download\\exam.pdf");
			
			return Response.ok(file)
					.header("Content-Disposition","attachment; filename ='Answer.pdf'")
					.build();
		}
		

		@GET
		@Path("/photo")
		@Produces("image/jpg")
		public Response getImage() {
			
			File file = new File("D:\\Download\\flower.jpg");
			
			return Response.ok(file)
					.header("Content-Disposition","attachment; filename ='image.jpg'")
					.build();
		}
}
