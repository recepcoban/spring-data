package com.recepcoban.controller;

import com.recepcoban.entity.User;
import com.recepcoban.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Recep Çoban on 2/26/2017.
 */
@RestController
public class UserController {

    @Autowired
    @Qualifier(value = "userService")
    private IUserService userService;

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
    public void save(@RequestBody User user) {
        userService.save(user);
    }

}
