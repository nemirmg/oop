package hw5.service;

import java.util.List;

import hw5.model.db.DataBase;
import hw5.model.impl.Student;

public class StudentService {

    public Student createStudent(String firstName, String lastName,
            int groupId) {
        int size = DataBase.studentsDB.size();
        int id = size + 1;

        Student student = new Student(id, firstName, lastName, groupId);
        DataBase.studentsDB.add(student);
        return student;
    }

    public Student getById(int id) throws Exception {
        Student student = DataBase.studentsDB  // список студентов
                .stream()  // запускаем отдельный поток для вычислений
                .filter(s -> s.getId() == id)  // фильтруем студентов по id
                .findFirst()  // вернуть первого найденного студента
                .orElse(null);  // если не нашли id, то возвращаем null

        if (student == null) {
            throw new Exception("Студент не найден");
        }
        return student;
    }

    public List<Student> getAllStudents() {
        return DataBase.studentsDB;
    }
}
