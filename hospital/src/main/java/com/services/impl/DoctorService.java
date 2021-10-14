package com.services.impl;

import com.dao.DoctorRepository;
import com.entities.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DoctorService implements com.services.DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Doctor add(Doctor doctor) {
        return doctorRepository.Add(doctor);
    }

    @Override
    public Doctor update(Doctor doctor) {
        return doctorRepository.Update(doctor);
    }

    @Override
    public Doctor removeById(int id) {
        return doctorRepository.RemoveById(id);
    }

    @Override
    public Doctor getById(int id) {
        return doctorRepository.GetById(id);
    }

    @Override
    public ArrayList<Doctor> getAll() {
        return doctorRepository.GetAll();
    }
}
