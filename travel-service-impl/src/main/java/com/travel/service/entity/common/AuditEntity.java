package com.travel.service.entity.common;

import java.util.Date;

import javax.persistence.Column;

import com.travel.service.entity.EmployeeEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuditEntity extends NamedEntity{
	
	private static final long serialVersionUID = 4449475611548900293L;

	@Builder.Default
	@Column(name = "CREATED_DATE")
	private Date startDate = new Date();
	
	@Column(name = "CREATED_BY")
	private EmployeeEntity createdBy;
	
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;
	
	@Column(name = "MODIFIED_BY")
	private EmployeeEntity modifiedBy;

}
