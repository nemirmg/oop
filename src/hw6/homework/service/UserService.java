package homework.service;

import homework.model.User;

public class UserService {

    public User createUser(String name) {
        return new User(name);
    }
}
