package com.recepcoban.service;

import com.recepcoban.entity.User;

import java.util.List;

/**
 * Created by Recep Çoban on 2/26/2017.
 */
public interface IUserService {

    User getUser(Long id);

    List<User> getAllUsers();

    List<User> findByFirstnameIgnoreCaseContains(String firstname);

    User save(User user);

}
