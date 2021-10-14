package com.dao.fakeImpl;

import com.entities.Doctor;
import lombok.var;

import java.util.ArrayList;

public class DoctorRepository implements com.dao.DoctorRepository {
    private static ArrayList<Doctor> doctors;

    static {
        doctors = new ArrayList<>();
    }

    @Override
    public Doctor Add(Doctor doctor) {
        var id = doctors.stream().mapToInt(v -> v.getId()).max().getAsInt() + 1;
        doctor.setId(id);
        doctors.add(doctor);
        return doctor;
    }

    @Override
    public Doctor Update(Doctor doctor) {
        return null;
    }

    @Override
    public Doctor RemoveById(int id) {
        var result = GetById(id);

        if(result != null) {
            if(doctors.remove(result))
            {
                return result;
            }

            return null;
        }

        return null;
    }

    @Override
    public Doctor GetById(int id) {
        return doctors.stream()
                .filter(x-> x.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public ArrayList<Doctor> GetAll() {
        return doctors;
    }
}
