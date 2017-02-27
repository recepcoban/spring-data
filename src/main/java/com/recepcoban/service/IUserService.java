package com.recepcoban.service;

import com.recepcoban.entity.User;

import java.util.List;

/**
 * Created by Recep Çoban on 2/26/2017.
 */
public interface IUserService {

    User getUser(Long id);

    List<User> getAllUsers();

    User findByFirstnameContains(String firstname);

    void save(User user);

}
