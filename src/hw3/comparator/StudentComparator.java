package hw3.comparator;

import java.util.Comparator;

import hw3.iterator.Student;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.id - o2.id;
    }
    
}
