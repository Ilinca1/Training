package com.endava.training.services;


import com.endava.training.dto.UserDTO;

import java.util.List;

/**
 * Created by ivamesu on 8/2/2016.
 */
public interface UserService {

    UserDTO getUserById(Integer id);

    List<UserDTO> getAllUsers();

    UserDTO saveUser(UserDTO userDTO);

    void deleteUser(Integer id);
}
