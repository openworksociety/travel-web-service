package com.travel.service.api;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.travel.service.dto.VehicleDto;

/**
 * @author hkanure
 *
 *         USE:
 */
@Path("sample")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface SampleTravelService {

  @GET
  @Path("/testmsg")
  String testMsg();

  @GET
  @Path("/findAllVehicles")
  List<VehicleDto> findAllVehicles();

  @DELETE
  @Path("/deletebyId/{id}")
  void deleteById(@PathParam("id") Long id);

  @POST
  @Path("/create")
  void create(VehicleDto dto);
}
