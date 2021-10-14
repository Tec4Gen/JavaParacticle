package com.ssu.hospital.service.impl;

import com.ssu.hospital.dao.fakeImpl.UserRepository;
import com.ssu.hospital.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserService implements com.ssu.hospital.service.UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User add(User user) {
        return userRepository.Add(user);
    }

    @Override
    public User update(User user) {
        return userRepository.Update(user);
    }

    @Override
    public User removeById(int id) {
        return userRepository.RemoveById(id);
    }

    @Override
    public User getById(int id) {
        return userRepository.GetById(id);
    }

    @Override
    public ArrayList<User> getAll() {
        return userRepository.GetAll();
    }
}
