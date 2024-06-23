package hw4.service;

import java.util.Collections;
import java.util.List;

import hw4.model.Student;
import hw4.model.StudentGroup;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student) {
        studentGroup.students.add(student);
    }

    public List<Student> sort() {
        Collections.sort(studentGroup.students);
        return studentGroup.students;
    }
}
