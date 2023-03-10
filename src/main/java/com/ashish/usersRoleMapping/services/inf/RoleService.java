package com.ashish.usersRoleMapping.services.inf;

import com.ashish.usersRoleMapping.entity.Role;

public interface RoleService {
	Role findByName(String name);
}
