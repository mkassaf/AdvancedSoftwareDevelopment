package edu.najah.cap.activity;

import java.util.List;

public interface IUserActivityService {

    void addUserActivity(UserActivity userActivity);

    List<UserActivity> getUserActivity(String userId);

    void removeUserActivity(String userId, String id);
}
