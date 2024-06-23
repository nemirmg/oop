package hw5.model.impl;

import hw5.model.User;

public class Student extends User {
    private int groupId;

    public Student(int id, String firstName, String lastName, int groupId) {
        super(id, firstName, lastName);
        this.groupId = groupId;
    }

}
