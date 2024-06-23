package hw5.controller;

import java.util.List;

import hw5.model.impl.Student;
import hw5.service.StudentService;

public class StudentController {
    private StudentService studentService = new StudentService();

    public Student createStudent(String firstName, String lastName, int groupId) {
        return studentService.createStudent(firstName, lastName, groupId);
    }

    public Student getById(int id) {
        Student student = null;
        try {
            student = studentService.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return student;
    }

    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
