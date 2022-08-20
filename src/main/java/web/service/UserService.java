package web.service;

import web.models.User;
import java.util.List;

public interface UserService {
    void saveUser(User user);
    User getUserById(int id);
    void updateUser(User user);
    void deleteUser(int id);
    List<User> getAllUsers();
}
