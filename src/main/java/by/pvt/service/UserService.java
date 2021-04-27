package by.pvt.service;

import by.pvt.model.User;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private static UserService singleton;

    private List<User> users = new ArrayList<User>();

    private UserService() {
        users.add(user(1, "Pavel", "Ivanouski"));
        users.add(user(2, "Alex", "Smith"));
        users.add(user(1, "Max", "Petrov"));
        users.add(user(1, "Pavel", "Ivanov"));

    }

    public static UserService getInstance() {
        if (singleton == null) {
            singleton = new UserService();
        }
        return singleton;
    }

    public List<User> getUserList() {
        return users;
    }

    private User user(Integer id, String fName, String lName) {
        User user = new User();
        user.setId(id);
        user.setFirstName(fName);
        user.setLastName(lName);
        return user;
    }


}
