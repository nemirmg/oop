package hw4.controller;

import hw4.model.Student;
import hw4.service.StudentGroupService;

public class StudentGroupController {
    private StudentGroupService service;

    public StudentGroupController(StudentGroupService service) {
        this.service = service;
    }

    public void addStudent(Student student) {
        service.addStudent(student);
    }
}
