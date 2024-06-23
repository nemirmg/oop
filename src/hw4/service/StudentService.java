package hw4.service;

import hw4.model.Student;

public class StudentService {
    public Student createStudent(int id, String name, String lastName) {
        return new Student(id, name, lastName);
    }
}
