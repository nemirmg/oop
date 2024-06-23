package hw5.service;

import hw5.model.db.DataBase;
import hw5.model.impl.Teacher;

public class TeacherService {
    public Teacher createTeacher(String firstName, String lastName) {
        int size = DataBase.teachersDB.size();
        int id = size + 1;

        Teacher teacher = new Teacher(id, firstName, lastName);
        DataBase.teachersDB.add(teacher);
        return teacher;
    }

    public Teacher getById(int id) throws Exception {
        Teacher teacher = DataBase.teachersDB
                .stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);

        if (teacher == null) {
            throw new Exception("Преподаватель не найден");
        }
        return teacher;
    }
}
