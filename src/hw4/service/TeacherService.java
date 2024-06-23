package hw4.service;

import hw4.model.Teacher;

public class TeacherService implements UserService<Teacher> {
    
    @Override
    public Teacher create(int id, String name, String lastName) {
        return new Teacher(id, name, lastName);
    }

}
