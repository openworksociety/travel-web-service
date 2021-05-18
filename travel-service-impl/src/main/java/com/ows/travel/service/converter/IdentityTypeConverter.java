package com.ows.travel.service.converter;

import com.ows.travel.entity.IdentityTypeEntity;
import com.ows.travel.service.dto.IdentityTypeDto;

public class IdentityTypeConverter {

	public static IdentityTypeEntity convertToEntity(IdentityTypeDto dto) {
		return IdentityTypeEntity.builder().id(dto.getId()).name(dto.getName()).isDeactivated(dto.isDeactivated())
				.build();
	}

	public static IdentityTypeDto convertToDTO(IdentityTypeEntity entity) {
		return IdentityTypeDto.builder().id(entity.getId()).name(entity.getName()).isDeactivated(entity.isDeactivated())
				.build();
	}

}
