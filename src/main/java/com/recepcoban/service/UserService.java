package com.recepcoban.service;

import com.recepcoban.entity.Address;
import com.recepcoban.entity.User;
import com.recepcoban.repository.IAddressRepository;
import com.recepcoban.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Recep Çoban on 2/26/2017.
 */
@Service
@Qualifier(value = "userService")
public class UserService implements IUserService {

    private final IUserRepository userRepository;
    private final IAddressRepository addressRepository;

    public UserService(IUserRepository userRepository, IAddressRepository addressRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public User getUser(Long id) {
        User user = userRepository.findOne(id);
        List<Address> addresses = addressRepository.findByUserId(id);
        user.setAddresses(addresses);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = (List<User>) userRepository.findAll();
        for (User user : users) {
            List<Address> addresses = addressRepository.findByUserId(user.getId());
            user.setAddresses(addresses);
        }
        return users;
    }

    @Override
    public List<User> findByFirstnameIgnoreCaseContains(String firstname) {
        return userRepository.findByFirstnameIgnoreCaseContains(firstname);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
