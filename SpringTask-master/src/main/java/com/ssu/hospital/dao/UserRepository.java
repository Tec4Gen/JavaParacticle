package com.ssu.hospital.dao;

import com.ssu.hospital.entities.User;

import java.util.ArrayList;

public interface UserRepository {
    User Add(User user);

    User Update(User user);

    User RemoveById(int id);

    User GetById(int id);

    ArrayList<User> GetAll();
}
