package com.ssu.hospital.service;

import com.ssu.hospital.entities.Appointment;

import java.util.ArrayList;

public interface AppointmentService {
    Appointment add(Appointment appointment);

    Appointment update(Appointment appointment);

    Appointment removeById(int id);

    Appointment getById(int id);

    ArrayList<Appointment> getAll();
}
