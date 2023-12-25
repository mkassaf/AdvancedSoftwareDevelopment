package edu.najah.cap.iam;

import edu.najah.cap.exceptions.BadRequestException;
import edu.najah.cap.exceptions.NotFoundException;
import edu.najah.cap.exceptions.SystemBusyException;

public interface IUserService {
    void addUser(UserProfile user);
    void updateUser(UserProfile user) throws NotFoundException, SystemBusyException, BadRequestException;
    void deleteUser(String userName) throws NotFoundException, SystemBusyException, BadRequestException;
    UserProfile getUser(String userName) throws NotFoundException, SystemBusyException, BadRequestException;
}
