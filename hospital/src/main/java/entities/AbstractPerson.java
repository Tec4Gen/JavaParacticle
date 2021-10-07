package entities;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AbstractPerson {

    private int id;

    private String firstName;

    private String lastName;

    private String patronymic;

    private String email;

    private String number;

    private String password;

    private List<Appointment> appointments;

    public AbstractPerson() {
    }

    public AbstractPerson(int id,
                          String firstName,
                          String lastName,
                          String patronymic,
                          String email,
                          String number,
                          String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.email = email;
        this.number = number;
        this.password = password;
        this.appointments = new ArrayList<>();
    }
}
