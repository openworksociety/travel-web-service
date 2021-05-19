package com.ows.travel.service.dto.security;

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
public class RoleDTO {

  private Long id;
  private String name;
  private List<UserDTO> users;
  private List<PrivilegeDTO> privileges;

}
