package services;

import entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
    private StudentsDao studentDao;

    public StudentService (StudentsDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student add(Student student)
    {
        StudentsDao.students.add(student);

        return student;
    }

    public List<Student> getExcellentStudents() {
        return studentDao.getStudents().stream().filter(s -> s.getAverageScore() >= 4.0).collect(Collectors.toList());
    }

    public List<Student> getBlockchainStudents() {
        return studentDao.getStudents().stream().filter(s -> s.getIsBlockChain()).collect(Collectors.toList());
    }

    public boolean exists(String studentName) {
        return studentDao.getStudents().stream().anyMatch(s -> s.getName().equals(studentName));
    }

    public ArrayList<Student> getAll() {
        return StudentsDao.students;
    }
}
