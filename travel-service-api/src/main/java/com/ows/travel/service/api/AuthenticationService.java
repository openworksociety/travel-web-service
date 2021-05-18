package com.ows.travel.service.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ows.travel.service.dto.JwtRequest;
import com.ows.travel.service.dto.JwtResponse;

public interface AuthenticationService {

	@PostMapping("/authenticate")
	ResponseEntity<JwtResponse> authenticate(@RequestBody JwtRequest authenticationRequest) throws Exception;

	@PostMapping("/register")
	ResponseEntity<JwtRequest> saveUser(@RequestBody JwtRequest userRequest) throws Exception;
	
}
