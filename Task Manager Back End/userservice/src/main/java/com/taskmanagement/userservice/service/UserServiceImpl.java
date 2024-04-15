package com.taskmanagement.userservice.service;

import com.taskmanagement.userservice.configuration.JwtProvider;
import com.taskmanagement.userservice.exception.UserException;
import com.taskmanagement.userservice.model.User;
import com.taskmanagement.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserProfileByJwt(String jwt) throws UserException {
        String email = JwtProvider.getEmailFromJwtToken(jwt);

        User user = userRepository.findByEmail(email);

        if(user == null){
            throw new UserException("User with email - "+email+" does not exists");
        }

        return user;

    }

    @Override
    public User findUserById(Long userId) throws UserException {
        Optional<User> opt = userRepository.findById(userId);

        if(opt.isEmpty()) {
            throw new UserException("user not found with id "+userId);
        }
        return opt.get();
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
