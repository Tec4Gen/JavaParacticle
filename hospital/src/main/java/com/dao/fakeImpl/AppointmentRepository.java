package com.dao.fakeImpl;

import com.entities.Appointment;
import lombok.var;

import java.util.ArrayList;

public class AppointmentRepository implements com.dao.AppointmentRepository {
    private static ArrayList<Appointment> appointments;

    static {
        appointments = new ArrayList<>();
    }

    @Override
    public Appointment Add(Appointment appointment) {
        var id = appointments.stream().mapToInt(v -> v.getId()).max().getAsInt() + 1;
        appointment.setId(id);
        appointments.add(appointment);
        return appointment;
    }

    @Override
    public Appointment Update(Appointment appointment) {
        return null;
    }

    @Override
    public Appointment RemoveById(int id) {
        var result = GetById(id);

        if(result != null) {
            if(appointments.remove(result))
            {
                return result;
            }

            return null;
        }

        return null;
    }

    @Override
    public Appointment GetById(int id) {
        return appointments.stream()
                .filter(x-> x.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public ArrayList<Appointment> GetAll() {
        return appointments;
    }
}
