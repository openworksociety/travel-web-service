package com.travel.service.dto.common;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = { "id" })
public class IdDto implements Serializable{

	private static final long serialVersionUID = -5189043573567235926L;
	private Long id;
	private boolean isDeactivated;
}
