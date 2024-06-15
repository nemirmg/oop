package Practice1.controller;

import java.util.List;

import Practice1.model.Teacher;
import Practice1.model.User;
import Practice1.service.TeacherGroupService;
import Practice1.service.TeacherService;
import Practice1.view.TeacherView;
import Practice1.view.UserView;

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
