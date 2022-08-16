package web.Service;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsersService {
    private List<User> userList;

    {
        userList = new ArrayList<>();
        userList.add(new User(1,"Dima", "Berzin", 23));
        userList.add(new User(2,"Dima", "Pronchatov", 25));
        userList.add(new User(3,"Sergei", "Skvorcov", 38));
        userList.add(new User(4,"Tatiana", "Novikova", 46));
        userList.add(new User(5,"Luda", "Vasiaeva", 22));
        userList.add(new User(6,"Andrey", "Trofimovskii", 30));
    }

    public List<User> allUsers() {
        return userList;
    }

    public User searchById(long id) {
        return userList.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
}
