package web.Service;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("JpaQlInspection")
@Component
@Transactional
public class UsersDAOImp {
    @PersistenceContext
    private EntityManager entityManager;

    public List<User> allUsers() {
        List<User> am= new ArrayList();
        return am= entityManager.createQuery("SELECT t from user t", User.class )
                .getResultList();
    }

//    public User searchById(long id) {
//        return userList.stream().filter(user -> user.getId() == id).findAny().orElse(null);
//    }
//
//    public void save(User user) {
//        user.setId(++USER_COUNT);
//        userList.add(user);
//    }
//
//    public void update(int id, User user) {
//        User userUpdate = searchById(id);
//        userUpdate.setName(user.getName());
//        userUpdate.setLast_name(user.getLast_name());
//        userUpdate.setAge(user.getAge());
//    }
}
