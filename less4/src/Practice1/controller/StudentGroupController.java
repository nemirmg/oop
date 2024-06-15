package Practice1.controller;

import Practice1.model.Student;
import Practice1.service.StudentGroupService;

public class StudentGroupController {
    private StudentGroupService service;

    public StudentGroupController(StudentGroupService service) {
        this.service = service;
    }

    public void addStudent(Student student) {
        service.addStudent(student);
    }
}
