package hw4.controller;

import java.util.List;

import hw4.model.Teacher;
import hw4.model.User;
import hw4.service.TeacherGroupService;
import hw4.service.TeacherService;
import hw4.view.TeacherView;
import hw4.view.UserView;

public class TeachersController implements UserController{
    private UserView<Teacher> teacherView = new TeacherView();
    private TeacherService teacherService = new TeacherService();
    private TeacherGroupService teacherGroupService = new TeacherGroupService();

    public void sendOnConsole(List<Teacher> teachers) {
        teacherView.sendOnConsole(teachers);
    }
    
    public void createTeacher(int id, String name, String lastName) {
        teacherGroupService.addTeacher(teacherService.create(id, name, lastName));
    }

    public void editTeacher(int num, Teacher teacher) {
        teacherGroupService.editTeacher(num, teacher);
    }

    public void sendOnConsole() {
        teacherView.sendOnConsole(teacherGroupService.getAllTeachers());
    }

    @Override
    public <T extends User> User create(T user) {
        return user;
    }
    
}
