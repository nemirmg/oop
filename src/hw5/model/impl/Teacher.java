package hw5.model.impl;

import java.util.ArrayList;
import java.util.List;

import hw5.model.User;

public class Teacher extends User {
    // id групп, в которых ведёт преподаватель
    private final List<Integer> groups = new ArrayList<>();

    public Teacher(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public void addGroupId(int groupId) {
        groups.add(groupId);
    }
    
}
