package Practice1.service;

import Practice1.model.User;

public interface UserService<T extends User> {
    public T create(int id, String name, String lastName);
}
