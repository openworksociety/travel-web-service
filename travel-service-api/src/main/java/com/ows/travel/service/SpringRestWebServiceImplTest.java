package com.ows.travel.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/new")
public class SpringRestWebServiceImplTest {
	
	@GetMapping(path = "/test", produces = "application/json")
	String test() {
		return "Hurreey";
	}

}
