package entities;

import lombok.Data;

import java.util.Date;

@Data
public class Appointment {
    private int id;

    private int idUser;

    private int IdDoctor;

    private Date Appointment;

    private Session session;

    public Appointment(int id, int idUser, int idDoctor, Date appointment, Session session) {
        this.id = id;
        this.idUser = idUser;
        IdDoctor = idDoctor;
        Appointment = appointment;
        this.session = session;
    }
}
