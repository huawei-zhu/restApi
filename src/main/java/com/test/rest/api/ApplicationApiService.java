package com.test.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.test.rest.api.model.User;


@Path("/api")
public class ApplicationApiService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public User getTrackInJSON2() {

		User instance = new User();
		instance.setName("test");

		return instance;

	}


	@GET
	@Path("/get")
	@Produces({ MediaType.TEXT_PLAIN,MediaType.APPLICATION_XML})
	public String getTrackInJSON() {

		return "track";

	}

	
//	@POST
//	@Path("/post")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response createTrackInJSON(User track) {
//
//		String result = "Track saved : " + track;
//		return Response.status(201).entity(result).build();
//		
//	}
//	
}