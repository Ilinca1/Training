package com.endava.webfundamentals.signin.service.impl;

import com.endava.webfundamentals.signin.dto.UserCredentialDTO;
import com.endava.webfundamentals.signin.dto.UserRegisterDTO;
import com.endava.webfundamentals.signin.model.User;
import com.endava.webfundamentals.signin.repository.UserRepository;
import com.endava.webfundamentals.signin.service.UserService;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivamesu on 8/1/2016.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Mapper mapper;

    @Override
    @Transactional(readOnly = true)
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<User> getAllUsers() {
       return userRepository.findAll();
    }

    @Override
    @Transactional
    public UserRegisterDTO saveUser(UserRegisterDTO userRegisterDTO) {
        User user = new User();
        user.setUsername(userRegisterDTO.getUsername());
        user.setPassword(userRegisterDTO.getPassword());
        return user != null ? mapper.map(userRepository.save(user), UserRegisterDTO.class) : null;
    }
}
