package com.ashish.usersRoleMapping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashish.usersRoleMapping.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
