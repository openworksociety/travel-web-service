package com.travel.service.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.travel.service.dto.IdentityTypeDto;

@Path("identitytype")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface IdentityTypeService {

	@GET
	@Path("/findAll")
	List<IdentityTypeDto> findAll();
	
	
	@POST
	@Path("/create")
	void create(IdentityTypeDto dto);

}
