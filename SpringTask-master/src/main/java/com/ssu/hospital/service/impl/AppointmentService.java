package com.ssu.hospital.service.impl;

import com.ssu.hospital.dao.fakeImpl.AppointmentRepository;
import com.ssu.hospital.entities.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AppointmentService implements com.ssu.hospital.service.AppointmentService {

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
