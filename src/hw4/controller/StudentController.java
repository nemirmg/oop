package hw4.controller;

import java.util.List;

import hw4.model.Student;
import hw4.model.User;
import hw4.view.StudentView;
import hw4.view.UserView;

public class StudentController implements UserController {

    private UserView<Student> view = new StudentView();

    public void sendOnConsole(List<Student> students) {
        view.sendOnConsole(students);
    }

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

}
