package com.ashish.usersRoleMapping.exception;

public class UsernameNotFoundException extends RuntimeException {

    //extra properties that you want to mange
    public UsernameNotFoundException() {
        super("Resource not found on server !!");
    }

    public UsernameNotFoundException(String message) {
        super(message);
    }

}
