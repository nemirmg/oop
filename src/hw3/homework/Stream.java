package hw3.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import hw3.iterator.StudentGroup;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> groups = new ArrayList<>();

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return groups.size() + "";
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }
}
