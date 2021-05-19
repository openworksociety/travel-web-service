package com.ows.travel.entity.common;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

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
@MappedSuperclass
public class NamedEntity extends IdEntity{
	
	private static final long serialVersionUID = 5395703514964768511L;
	
	@Column(name = "NAME")
	private String name;

}
