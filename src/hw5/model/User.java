package hw5.model;

public abstract class User {
    protected int id;
    protected String firstName;
    protected String lastName;

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format(
            getClass().getSimpleName() + 
            "[id=%s, firstName='%s', lastName='%s']", 
            id, firstName, lastName
        );
    }
}
