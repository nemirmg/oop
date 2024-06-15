package Practice1.controller;

import java.util.List;

import Practice1.model.Student;
import Practice1.model.User;
import Practice1.view.StudentView;
import Practice1.view.UserView;

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
