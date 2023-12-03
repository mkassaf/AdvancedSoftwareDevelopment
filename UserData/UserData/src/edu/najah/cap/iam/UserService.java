package edu.najah.cap.iam;

import java.util.HashMap;
import java.util.Map;

public class UserService implements IUserService {

    private static final Map<String, UserProfile> users = new HashMap<>();

    @Override
    public void addUser(UserProfile user) {
        users.put(user.getUserName(), user);
    }

    @Override
    public void updateUser(UserProfile user) {
        users.put(user.getUserName(), user);
    }

    @Override
    public void deleteUser(String userName) {
        users.remove(userName);
    }

    @Override
    public UserProfile getUser(String userName) {
        return users.get(userName);
    }
}
