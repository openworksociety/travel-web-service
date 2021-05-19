package com.ows.travel.service.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -2074771592038468429L;
	private final String jwttoken;

}
