package edu.najah.cap.activity;

import edu.najah.cap.payment.Transaction;

import java.util.*;

public class UserActivityService implements IUserActivityService {
    private static final Map<String, List<UserActivity>> userActivityMap = new HashMap<>();
    @Override
    public void addUserActivity(UserActivity userActivity) {
        userActivityMap.computeIfAbsent(userActivity.getUserId(), key -> new ArrayList<>()).add(userActivity);
    }

    @Override
    public List<UserActivity> getUserActivity(String userId) {
        return userActivityMap.get(userId);
    }

    @Override
    public void removeUserActivity(String userId, String id) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Iterator<UserActivity> iterator = userActivityMap.get(userId).iterator();
        while (iterator.hasNext()) {
            UserActivity activity = iterator.next();
            if (activity.getId().equals(id)) {
                iterator.remove();
            }
        }
        userActivityMap.put(userId, userActivityMap.get(userId));
    }
}
