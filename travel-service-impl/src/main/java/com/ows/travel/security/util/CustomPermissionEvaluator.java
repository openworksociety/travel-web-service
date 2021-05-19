package com.ows.travel.security.util;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class CustomPermissionEvaluator implements PermissionEvaluator {

	@Override
	public boolean hasPermission(Authentication authentication, Object accessType, Object permission) {
		if (authentication != null && accessType instanceof String) {
			if ("hasAccess".equalsIgnoreCase(String.valueOf(accessType))) {
				boolean hasAccess = validateAccess(String.valueOf(permission));
				return hasAccess;
			}
			return false;
		}
		return false;
	}

	private boolean validateAccess(String permission) {
		Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication()
				.getAuthorities();
		boolean access = authorities.stream()
				.anyMatch(authority -> authority.getAuthority().equalsIgnoreCase(permission));
		return access;
	}

	@Override
	public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType,
			Object permission) {
		return false;
	}

}
