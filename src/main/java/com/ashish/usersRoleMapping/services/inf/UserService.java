package com.ashish.usersRoleMapping.services.inf;

import java.util.List;

import com.ashish.usersRoleMapping.entity.User;
import com.ashish.usersRoleMapping.modal.UserDto;


public interface UserService {
	 User save(UserDto user);
	    List<User> findAll();
	    User findOne(String username);
}
