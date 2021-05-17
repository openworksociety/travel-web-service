package com.travel.service.dto.security;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PrivilegeDTO {

  private Long id;
  private String name;
  private List<RoleDTO> roles;

}
