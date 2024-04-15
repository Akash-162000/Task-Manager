package com.taskmanagement.userservice.service;

import com.taskmanagement.userservice.exception.UserException;
import com.taskmanagement.userservice.model.User;

import java.util.List;

public interface UserService {
    public User findUserProfileByJwt(String jwt) throws UserException;

    public User findUserById(Long userId) throws UserException;

    public List<User> findAllUsers();
}
