package com.travel.service.dto.common;

import java.util.Date;

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
public class AuditDetail extends NamedDto{
	
	private static final long serialVersionUID = -3553863340923753500L;

	private Date startDate;
	
//	private EmployeeEntity createdBy;
	
	private Date modifiedDate;
	
//	private EmployeeEntity modifiedBy;

}
