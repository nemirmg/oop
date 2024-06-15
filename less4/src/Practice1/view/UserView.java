package Practice1.view;

import java.util.List;

import Practice1.model.User;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> users);
}
