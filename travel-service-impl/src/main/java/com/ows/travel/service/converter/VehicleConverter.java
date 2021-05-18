package com.ows.travel.service.converter;

import com.ows.travel.entity.VehicleEntity;
import com.ows.travel.service.dto.VehicleDto;

public class VehicleConverter {

  public static VehicleEntity convertToEntity(VehicleDto dto) {
    return VehicleEntity.builder().id(dto.getId()).type(dto.getType()).color(dto.getColor())
        .number(dto.getNumber()).deactive(dto.isDeactive()).build();
  }

  public static VehicleDto convertToDTO(VehicleEntity entity) {
    return VehicleDto.builder().id(entity.getId()).type(entity.getType()).color(entity.getColor())
        .number(entity.getNumber()).deactive(entity.isDeactive()).build();
  }

}
