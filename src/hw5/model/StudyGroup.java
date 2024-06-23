package hw5.model;

import java.util.List;

import hw5.model.impl.Teacher;
import hw5.model.impl.Student;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> studentsGroup;

    public StudyGroup(Teacher teacher, List<Student> studentsGroup) {
        this.teacher = teacher;
        this.studentsGroup = studentsGroup;
    }

    @Override
    public String toString() {
        return "StudyGroup{" + 
               "teacher=" + teacher + 
               ", studentsGroup=" + studentsGroup + 
               '}';
    }
}
