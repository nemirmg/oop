package Practice1.view;

import java.util.List;

import Practice1.model.Teacher;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        System.out.println(teachers);
    }

}
