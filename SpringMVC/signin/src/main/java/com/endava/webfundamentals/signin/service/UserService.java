package com.endava.webfundamentals.signin.service;

import com.endava.webfundamentals.signin.dto.UserCredentialDTO;
import com.endava.webfundamentals.signin.dto.UserRegisterDTO;
import com.endava.webfundamentals.signin.model.User;

import java.util.List;

/**
 * Created by ivamesu on 8/1/2016.
 */
public interface UserService {

    User getUserByUsername(String username);

    Iterable<User> getAllUsers();

    UserRegisterDTO saveUser(UserRegisterDTO userRegisterDTO);
}
