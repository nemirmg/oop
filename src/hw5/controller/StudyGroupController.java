package hw5.controller;

import java.util.ArrayList;
import java.util.List;

import hw5.model.StudyGroup;
import hw5.model.impl.Student;
import hw5.model.impl.Teacher;
import hw5.service.StudyGroupService;
import hw5.service.TeacherService;

public class StudyGroupController {
    private TeacherService teacherService = new TeacherService();
    private StudentController studentController = new StudentController();
    private StudyGroupService studyGroupService = new StudyGroupService();

    public Teacher createTeacher(String firstName, String lastName) {
        return teacherService.createTeacher(firstName, lastName);
    }

    public Teacher getById(int id) {
        Teacher teacher = null;
        try {
            teacher = teacherService.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return teacher;
    }

    public StudyGroup createStudyGroup(int teacherId, int[] studentsId) {
        List<Student> studentsGroup = new ArrayList<>();
        for (int item : studentsId) {
            studentsGroup.add(studentController.getById(item));
        }
        return studyGroupService.createStudyGroup(getById(teacherId), studentsGroup);
    }
}
