package com.ows.travel.service.dto;

import com.ows.travel.service.dto.common.AuditDetail;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class IdentityTypeDto extends AuditDetail{

	private static final long serialVersionUID = -8726173375517725339L;

}
