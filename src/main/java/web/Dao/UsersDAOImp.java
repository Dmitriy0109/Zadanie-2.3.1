package web.Dao;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Component
@Transactional
public class UsersDAOImp {
    @PersistenceContext
    private final EntityManager entityManager;

    public UsersDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public List<User> allUsers() {
        return entityManager.createQuery("SELECT t from User  t", User.class )
                .getResultList();

    }

    public User searchById(int id) {
       return entityManager.find(User.class,id);
    }

    public void save(User user) {
        entityManager.persist(user);
    }

    public void update(int id, User user) {
        User us=entityManager.find(User.class,id);
        us.setName(user.getName());
        us.setLast_name(user.getLast_name());
        us.setAge(user.getAge());
    }
    public void delete(int id){
        entityManager.remove(entityManager.find(User.class,id));
    }
}
