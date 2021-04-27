package com.travel.service.dto.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NamedDto extends IdDto{
	
	private static final long serialVersionUID = -1468582648831385514L;
	private String name;

}
