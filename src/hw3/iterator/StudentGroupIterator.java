package hw3.iterator;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    private StudentGroup sg = new StudentGroup();
    private int index = 0;

    public StudentGroupIterator(StudentGroup group) {
        this.sg = group;
    }

    private Student[] getStudents() {
        String[] names = sg.students.toString().split(" ");
        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], i);
        }
        return students;
    }

    @Override
    public boolean hasNext() {
        return index < getStudents().length;
    }

    @Override
    public Student next() {
        Student[] students = getStudents();
        return students[index++];
    }
    
}
