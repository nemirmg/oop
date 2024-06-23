package hw4.controller;

import hw4.model.User;

public interface UserController {
    <T extends User> User create(T user);
}
