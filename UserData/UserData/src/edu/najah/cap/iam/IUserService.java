package edu.najah.cap.iam;

public interface IUserService {
    void addUser(UserProfile user);
    void updateUser(UserProfile user);
    void deleteUser(String userName);
    UserProfile getUser(String userName);
}
