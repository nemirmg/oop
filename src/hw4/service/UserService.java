package hw4.service;

import hw4.model.User;

public interface UserService<T extends User> {
    public T create(int id, String name, String lastName);
}
