package services;

import entities.Student;

import java.util.ArrayList;

public class StudentService {
    public StudentService () { }

    Student add(Student student)
    {
        StorageData.students.add(student);

        return student;
    }

    ArrayList<Student> getAll() {
        return StorageData.students;
    }
}
