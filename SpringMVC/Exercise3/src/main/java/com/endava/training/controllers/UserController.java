package com.endava.training.controllers;

import com.endava.training.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.endava.training.services.UserService;
import java.util.List;

/**
 * Created by ivamesu on 8/2/2016.
 */
@RestController
public class UserController {

//    @Autowired
//    private UserRepository repository;
//
//    @RequestMapping(method = RequestMethod.GET)
//    @ResponseBody
//    public List<User> users() {
//        return repository.findAll();
//    }

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {

        return userService.saveUser(userDTO);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public UserDTO getUser(@PathVariable Integer id) {

        return userService.getUserById(id);
    }

    @RequestMapping(value="/user", method = RequestMethod.GET)
    @ResponseBody
    public List<UserDTO> getAllUsers() {

        return userService.getAllUsers();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable Integer id) {
        userService.deleteUser(id);
    }

}
