package com.ashish.usersRoleMapping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashish.usersRoleMapping.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findRoleByName(String name);
}