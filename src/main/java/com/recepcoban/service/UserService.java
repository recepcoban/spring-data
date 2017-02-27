package com.recepcoban.service;

import com.recepcoban.entity.User;
import com.recepcoban.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Recep Çoban on 2/26/2017.
 */
@Service
@Qualifier(value = "userService")
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public User getUser(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = (List<User>) userRepository.findAll();
        return users;
    }

    @Override
    public User findByFirstnameContains(String firstname) {
        return userRepository.findByFirstnameContains(firstname);
    }

    @Override
    public void save(User user) {
        if (user.getFirstname().isEmpty() || user.getFirstname() == null) {
            throw new NullPointerException("Name is required field!");
        }
        else {
            userRepository.save(user);
        }
    }
}
