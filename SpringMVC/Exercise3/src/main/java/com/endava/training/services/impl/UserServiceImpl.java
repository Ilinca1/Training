package com.endava.training.services.impl;

import com.endava.training.entities.User;
import com.endava.training.repositories.UserRepository;
import com.endava.training.dto.UserDTO;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.endava.training.services.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivamesu on 8/2/2016.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Mapper mapper;

    @Override
    public UserDTO getUserById(Integer id) {
        User user = userRepository.findOne(id);
        return mapper.map(user, UserDTO.class);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserDTO> userDTOs = new ArrayList<UserDTO>();
        Iterable<User> users = userRepository.findAll();
        for (User user : users)
            userDTOs.add(mapper.map(user, UserDTO.class));
        return userDTOs;
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        User user = mapper.map(userDTO, User.class);
        return mapper.map(userRepository.save(user), UserDTO.class);
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.delete(id);
    }
}
