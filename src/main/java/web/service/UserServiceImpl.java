package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.models.User;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao dao;

    @Autowired
    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void saveUser(User user) {
        dao.saveUser(user);
    }
    @Override
    public User show(int id) {
        return this.dao.show(id);
    }
    @Override
    public void update(User user) {
        this.dao.update(user);
    }
    @Override
    public void delete(int id) {
        this.dao.delete(id);
    }
    @Override
    public List<User> getAllUsers() {
        return this.dao.getAllUsers();
    }
}

