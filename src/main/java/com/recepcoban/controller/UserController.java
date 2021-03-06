package com.recepcoban.controller;

import com.recepcoban.entity.User;
import com.recepcoban.service.IUserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Recep Çoban on 2/26/2017.
 */
@RestController
public class UserController {

    private final IUserService userService;

    public UserController(@Qualifier(value = "userService") IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String index() {
        return "Hello!";
    }

    @GetMapping(value = "/user/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @GetMapping(value = "/users")
    public List<User> getAllUsers(@RequestHeader(value = "Accept-Language") String acceptLanguage) {
        System.out.println(acceptLanguage);
        return userService.getAllUsers();
    }

    @GetMapping(value = "/users/{firstname}")
    public List<User> findByFirstnameIgnoreCaseContains(@PathVariable String firstname) {
        return userService.findByFirstnameIgnoreCaseContains(firstname);
    }

    @PostMapping(value = "/user")
    public User save(@Validated @RequestBody User user) {
        return userService.save(user);
    }

}
