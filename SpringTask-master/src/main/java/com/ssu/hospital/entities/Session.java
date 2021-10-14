package com.ssu.hospital.entities;

import lombok.Data;

@Data
public class Session {
    private int id;

    private Boolean isCame;

    private Boolean isIll;

    private Boolean isComplete;

    private String description;
}
