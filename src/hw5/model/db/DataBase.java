package hw5.model.db;

import java.util.ArrayList;
import java.util.List;

import hw5.model.impl.Student;
import hw5.model.impl.Teacher;

public class DataBase {
    public static final List<Student> studentsDB = new ArrayList<>();
    public static final List<Teacher> teachersDB = new ArrayList<>();

    public static void fillDB() {
        Teacher teacher = new Teacher(1, "Василий", "Иванов");
        teacher.addGroupId(1);
        teachersDB.add(teacher);

        Student s1 = new Student(1, "Андрей", "Петров", 1);
        Student s2 = new Student(2, "Марина", "Герасимова", 1);
        studentsDB.add(s1);
        studentsDB.add(s2);
    }
}
