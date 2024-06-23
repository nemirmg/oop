package hw4.service;

import java.util.ArrayList;
import java.util.List;

import hw4.model.Teacher;

public class TeacherGroupService {
    private List<Teacher> teachers = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void editTeacher(int num, Teacher teacher) {
        teachers.set(num, teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }
}
