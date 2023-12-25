package edu.najah.cap.iam;

import edu.najah.cap.exceptions.BadRequestException;
import edu.najah.cap.exceptions.NotFoundException;
import edu.najah.cap.exceptions.SystemBusyException;
import edu.najah.cap.exceptions.Util;

import java.util.HashMap;
import java.util.Map;

public class UserService implements IUserService {

    private static final Map<String, UserProfile> users = new HashMap<>();

    @Override
    public void addUser(UserProfile user) {
        users.put(user.getUserName(), user);
    }

    @Override
    public void updateUser(UserProfile user) throws NotFoundException, SystemBusyException, BadRequestException {
        Util.validateUserName(user.getUserName());
        if (!users.containsKey(user.getUserName())) {
            throw new NotFoundException("User does not exist");
        }
        users.put(user.getUserName(), user);
    }

    @Override
    public void deleteUser(String userName) throws NotFoundException, SystemBusyException, BadRequestException {
        Util.validateUserName(userName);
        if (!users.containsKey(userName)) {
            throw new NotFoundException("User does not exist");
        }
        users.remove(userName);
    }

    @Override
    public UserProfile getUser(String userName) throws NotFoundException, SystemBusyException, BadRequestException {
        Util.validateUserName(userName);
        if (!users.containsKey(userName)) {
            throw new NotFoundException("User does not exist");
        }
        return users.get(userName);
    }
}
