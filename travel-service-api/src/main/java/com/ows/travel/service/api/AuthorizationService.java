package com.ows.travel.service.api;

import org.springframework.web.bind.annotation.GetMapping;

public interface AuthorizationService {
	
	@GetMapping("/read")
	void readAccessOnly();
	
	@GetMapping("/write")
	void writeAccessOnly();
	
	@GetMapping("/delete")
	void deleteAccessOnly();

}
