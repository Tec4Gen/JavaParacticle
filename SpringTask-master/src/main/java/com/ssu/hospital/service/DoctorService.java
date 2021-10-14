package com.ssu.hospital.service;

import com.ssu.hospital.entities.Doctor;

import java.util.ArrayList;

public interface DoctorService {
    Doctor add(Doctor doctor);

    Doctor update(Doctor doctor);

    Doctor removeById(int id);

    Doctor getById(int id);

    ArrayList<Doctor> getAll();
}
