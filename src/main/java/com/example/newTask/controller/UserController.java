package com.example.newTask.controller;

import com.example.newTask.Service.UserService;
import com.example.newTask.dto.UserDto;
import com.example.newTask.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api")

public class UserController {
    public final UserService userService;
@Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping(value = "/addNewUser")
    public User addUserUser(@RequestBody UserDto userDto){
        return userService.addUserUser(userDto);
    }
@GetMapping(value = "/getById")
    public User getIdBy(@PathVariable)
}
