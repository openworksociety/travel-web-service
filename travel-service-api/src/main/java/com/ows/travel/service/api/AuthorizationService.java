package com.ows.travel.service.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/authorization")
public interface AuthorizationService {

	@GetMapping("/read")
	void readAccess();

	@GetMapping("/modify")
	void modifyAccess();

	@GetMapping("/delete")
	void deleteAccess();

}
