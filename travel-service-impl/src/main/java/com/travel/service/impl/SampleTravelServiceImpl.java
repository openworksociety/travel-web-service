package com.travel.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;
import javax.ws.rs.InternalServerErrorException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.travel.service.api.SampleTravelService;
import com.travel.service.converter.VehicleConverter;
import com.travel.service.dto.VehicleDto;
import com.travel.service.entity.VehicleEntity;
import com.travel.service.repository.VehicleRepository;

@Service
@Transactional
public class SampleTravelServiceImpl implements SampleTravelService {

  @Resource
  private VehicleRepository vehicleRepository;

  @Override
  public String testMsg() {
    return "Helloo, This is sample text message for REST service";
  }

  @Override
  public List<VehicleDto> findAllVehicles() {
   // List<VehicleEntity> entities = vehicleRepository.findAll();
	  List<VehicleEntity> entities = new ArrayList<VehicleEntity>();
	  entities.add(VehicleEntity.builder().id(1L).deactive(true).color("RED").number("123").type("BUS").build());
	  entities.add(VehicleEntity.builder().id(2L).deactive(true).color("PINK").number("111").type("CAR").build());
    return entities.stream().map(VehicleConverter::convertToDTO).collect(Collectors.toList());
  }

  @Override
  public void deleteById(Long id) {
    vehicleRepository.deleteById(id);
  }

  @Override
  public void create(VehicleDto dto) {
    VehicleEntity entity = VehicleConverter.convertToEntity(dto);
    VehicleEntity saveEntity = vehicleRepository.save(entity);

    if (saveEntity == null) {
      throw new InternalServerErrorException("VehicleEntity is not created");
    }

  }

}
