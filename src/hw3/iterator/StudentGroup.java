package hw3.iterator;

import java.util.Iterator;

public class StudentGroup implements Iterable<Student> {
    public StringBuilder students = new StringBuilder();

    public void addStudent(Student student) {
        students.append(student).append(" ");
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {
        String[] names = students.toString().split(" ");
        String str = String.join(", ", names);
        return "[" + str + "]";
    }

    
}
