package com.services.impl;

import com.dao.AppointmentRepository;
import com.entities.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AppointmentService implements com.services.AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public Appointment add(Appointment appointment) {
        return appointmentRepository.Add(appointment);
    }

    @Override
    public Appointment update(Appointment appointment) {
        return appointmentRepository.Update(appointment);
    }

    @Override
    public Appointment removeById(int id) {
        return appointmentRepository.RemoveById(id);
    }

    @Override
    public Appointment getById(int id) {
        return appointmentRepository.GetById(id);
    }

    @Override
    public ArrayList<Appointment> getAll() {
        return appointmentRepository.GetAll();
    }
}
