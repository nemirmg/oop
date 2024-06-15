package Practice1.service;

import Practice1.model.Teacher;

public class TeacherService implements UserService<Teacher> {
    
    @Override
    public Teacher create(int id, String name, String lastName) {
        return new Teacher(id, name, lastName);
    }

}
