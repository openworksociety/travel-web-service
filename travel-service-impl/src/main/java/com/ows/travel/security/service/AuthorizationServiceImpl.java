package com.ows.travel.security.service;

import org.springframework.web.bind.annotation.RestController;

import com.ows.travel.security.annotations.UserFullAccess;
import com.ows.travel.security.annotations.UserModifyAccess;
import com.ows.travel.security.annotations.UserReadAccess;
import com.ows.travel.service.api.AuthorizationService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class AuthorizationServiceImpl implements AuthorizationService {

	@Override
	@UserReadAccess
	public void readAccess() {
		log.info("You have READ access");
	}

	@Override
	@UserModifyAccess
	public void modifyAccess() {
		log.info("You have WRITE access");
	}

	@Override
	@UserFullAccess
	public void deleteAccess() {
		log.info("User with full access");
	}

}
