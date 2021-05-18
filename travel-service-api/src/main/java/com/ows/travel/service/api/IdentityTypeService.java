package com.ows.travel.service.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ows.travel.service.dto.IdentityTypeDto;

@RequestMapping("/identity")
public interface IdentityTypeService {

	@GetMapping("/hello")
	String sayHello();

	@ResponseBody
	@GetMapping("/findAll")
	List<IdentityTypeDto> findAll();

	@PostMapping("/create")
	void create(@RequestBody IdentityTypeDto dto);

	@ResponseBody
	@GetMapping("/findById/{id}")
	IdentityTypeDto findById(@PathVariable Long id);

}
