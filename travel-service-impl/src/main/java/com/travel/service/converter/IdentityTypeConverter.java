package com.travel.service.converter;

import com.travel.service.dto.IdentityTypeDto;
import com.travel.service.entity.IdentityTypeEntity;

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
