package hw5.service;

import java.util.List;

import hw5.model.StudyGroup;
import hw5.model.impl.Student;
import hw5.model.impl.Teacher;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, 
                                       List<Student> studentsGroup) {
        return new StudyGroup(teacher, studentsGroup);
    }
}
