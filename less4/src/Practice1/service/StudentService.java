package Practice1.service;

import Practice1.model.Student;

public class StudentService {
    public Student createStudent(int id, String name, String lastName) {
        return new Student(id, name, lastName);
    }
}
