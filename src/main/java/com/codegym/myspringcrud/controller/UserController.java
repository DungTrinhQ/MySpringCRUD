package com.codegym.myspringcrud.controller;

import com.codegym.myspringcrud.model.User;
import com.codegym.myspringcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public  String index(Model model){
        List<User> users = userService.getAllUser();

        model.addAttribute("users", users);

        return "index";
    }

    @RequestMapping(value = "add")
    public  String addUser(Model model){
        model.addAttribute("user", new User());
        return "addUser";
    }


}
