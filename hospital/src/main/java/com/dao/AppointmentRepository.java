package com.dao;

import com.entities.Appointment;

import java.util.ArrayList;

public interface AppointmentRepository {
    Appointment Add(Appointment user);

    Appointment Update(Appointment user);

    Appointment RemoveById(int id);

    Appointment GetById(int id);

    ArrayList<Appointment> GetAll();
}
