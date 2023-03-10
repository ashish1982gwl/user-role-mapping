package com.ashish.usersRoleMapping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashish.usersRoleMapping.entity.Role;
import com.ashish.usersRoleMapping.repository.RoleDao;
import com.ashish.usersRoleMapping.services.inf.RoleService;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role findByName(String name) {
        Role role = roleDao.findRoleByName(name);
        return role;
    }
}