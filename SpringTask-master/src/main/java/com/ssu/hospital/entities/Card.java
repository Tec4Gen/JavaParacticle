package com.ssu.hospital.entities;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Card {

    private int id;

    private List<Appointment> appointments;

    public Card(int id) {
        this.id = id;
        appointments = new ArrayList<>();
    }
}
