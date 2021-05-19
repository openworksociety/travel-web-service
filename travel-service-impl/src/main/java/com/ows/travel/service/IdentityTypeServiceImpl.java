package com.ows.travel.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import com.ows.travel.entity.IdentityTypeEntity;
import com.ows.travel.repository.IdentityTypeRepository;
import com.ows.travel.service.api.IdentityTypeService;
import com.ows.travel.service.converter.IdentityTypeConverter;
import com.ows.travel.service.dto.IdentityTypeDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Transactional
@RestController
public class IdentityTypeServiceImpl implements IdentityTypeService {

	@Override
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String sayHello() {
		return "Helloo";
	}

	private IdentityTypeRepository identityTypeRepository;

	@Override
	public void create(IdentityTypeDto dto) {
		IdentityTypeEntity entity = IdentityTypeConverter.convertToEntity(dto);
		IdentityTypeEntity save = identityTypeRepository.save(entity);
		log.info("Record Saved succesfully", save.getId());
	}

	@Override
	public List<IdentityTypeDto> findAll() {
		List<IdentityTypeDto> result = identityTypeRepository.findAll().stream()
				.map(IdentityTypeConverter::convertToDTO).collect(Collectors.toList());
		log.info("Total record fetched : ", result.size());
		return result;
	}

	@Override
	public IdentityTypeDto findById(Long id) {
		Optional<IdentityTypeEntity> identityType = identityTypeRepository.findById(id);
		if (identityType.isPresent()) {
			return IdentityTypeConverter.convertToDTO(identityType.get());
		}
		return null;
	}
}
