package Practice1.controller;

import Practice1.model.User;

public interface UserController {
    <T extends User> User create(T user);
}
