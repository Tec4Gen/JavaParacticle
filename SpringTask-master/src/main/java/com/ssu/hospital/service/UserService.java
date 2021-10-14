package com.ssu.hospital.service;

import com.ssu.hospital.entities.User;

import java.util.ArrayList;

public interface UserService {
    User add(User user);

    User update(User user);

    User removeById(int id);

    User getById(int id);

    ArrayList<User> getAll();
}
