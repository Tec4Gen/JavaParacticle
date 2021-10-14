package com.ssu.hospital.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Doctor extends AbstractPerson {
    private Position position;

    public Doctor(int id, String firstName, String lastName, String patronymic, String email, String number, String password,Position position) {
        super(id, firstName, lastName, patronymic, email, number, password);
        this.position = position;
    }

    public enum Position {
        Therapist,
        Dentist
    }

}

