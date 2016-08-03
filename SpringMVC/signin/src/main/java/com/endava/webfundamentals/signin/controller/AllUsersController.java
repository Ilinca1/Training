package com.endava.webfundamentals.signin.controller;

import com.endava.webfundamentals.signin.dto.UserCredentialDTO;
import com.endava.webfundamentals.signin.model.User;
import com.endava.webfundamentals.signin.repository.UserRepository;
import com.endava.webfundamentals.signin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Iterator;
import java.util.List;

/**
 * Created by ivamesu on 8/1/2016.
 */
@Controller
@RequestMapping("/users")
public class AllUsersController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String findAll(Model model) {
        Iterable<User> list = userService.getAllUsers();
        model.addAttribute("list", list);
        return "users";
    }
}
