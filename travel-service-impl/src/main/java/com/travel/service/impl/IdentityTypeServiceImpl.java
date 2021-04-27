package com.travel.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.travel.service.api.IdentityTypeService;
import com.travel.service.converter.IdentityTypeConverter;
import com.travel.service.dto.IdentityTypeDto;
import com.travel.service.entity.IdentityTypeEntity;
import com.travel.service.repository.IdentityTypeRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class IdentityTypeServiceImpl implements IdentityTypeService {

	@Resource
	private IdentityTypeRepository identityTypeRepository;

	@Override
	public void create(IdentityTypeDto dto) {
		IdentityTypeEntity entity = IdentityTypeConverter.convertToEntity(dto);
		IdentityTypeEntity save = identityTypeRepository.save(entity);
		log.info("Record Saved succesfully", save.getId());
	}

	@Override
	public List<IdentityTypeDto> findAll() {
		List<IdentityTypeDto> result = identityTypeRepository.findAll().stream().map(IdentityTypeConverter::convertToDTO).collect(Collectors.toList());
		log.info("Total record fetched : ", result.size());
		return result;
	}

}