package web.Servises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.Dao.UsersDAOImp;
import web.model.User;

import java.util.List;
@Component
public class UsersServises {
    private final UsersDAOImp usersDAOImp;
    @Autowired
    public UsersServises(UsersDAOImp usersDAOImp){
        this.usersDAOImp=usersDAOImp;
    }
    public List<User> allUsers() {
        return usersDAOImp.allUsers();
    }
    public User searchById(int id) {
        return usersDAOImp.searchById(id);
    }
    public void save(User user) {
        usersDAOImp.save(user);
    }
    public void update(int id, User user) {
        usersDAOImp.update(id,user);
    }
    public void delete(int id){
        usersDAOImp.delete(id);
    }
}
