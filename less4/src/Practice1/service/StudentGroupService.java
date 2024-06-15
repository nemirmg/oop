package Practice1.service;

import java.util.Collections;
import java.util.List;

import Practice1.model.Student;
import Practice1.model.StudentGroup;

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
