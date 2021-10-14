package com.ssu.hospital.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class User extends AbstractPerson {
    private Card card;

    public User(int id, String firstName, String lastName, String patronymic, String email, String number, String password, Card card) {
        super(id, firstName, lastName, patronymic, email, number, password);
        this.card = card;
    }
}
