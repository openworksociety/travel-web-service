package com.ows.travel.security.service;

import com.ows.travel.service.api.AuthorizationService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthorizationServiceImpl implements AuthorizationService {

	@Override
	public void readAccessOnly() {
		log.info("You have READ access");
	}

	@Override
	public void writeAccessOnly() {
		log.info("You have WRITE access");
	}

	@Override
	public void deleteAccessOnly() {
		log.info("You are Admin user");
	}

}
