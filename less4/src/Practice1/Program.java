package Practice1;

import java.util.List;

import Practice1.controller.StudentController;
import Practice1.controller.TeachersController;
import Practice1.model.Student;
import Practice1.model.Teacher;

public class Program {
    public static void main(String[] args) {
        // new StudentController().sendOnConsole(getStudents());

        TeachersController tc = new TeachersController();
        tc.createTeacher(1, "Андрей", "Фролов");
        tc.createTeacher(2, "Светлана", "Петрова");
        tc.sendOnConsole();
        tc.editTeacher(0, new Teacher(5, "Анна", "Фролова"));
        tc.sendOnConsole();

    }

    // private static List<Student> getStudents() {
    //     Student s1 = new Student(1, "Саша", "Иванов");
    //     Student s2 = new Student(2, "Ира", "Иванова");
    //     return List.of(s1, s2);
    // }
}
