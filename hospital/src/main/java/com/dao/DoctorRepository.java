package com.dao;

import com.entities.Doctor;

import java.util.ArrayList;

public interface DoctorRepository {
    Doctor Add(Doctor user);

    Doctor Update(Doctor user);

    Doctor RemoveById(int id);

    Doctor GetById(int id);

    ArrayList<Doctor> GetAll();
}
