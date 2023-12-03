package edu.najah.cap.activity;

public class UserActivity {
    private final String id = java.util.UUID.randomUUID().toString();
    private final String userId;
    private final String activityType;
    private final String activityDate;

    public UserActivity(String userId, String activityType, String activityDate) {
        this.userId = userId;
        this.activityType = activityType;
        this.activityDate = activityDate;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getActivityType() {
        return activityType;
    }

    public String getActivityDate() {
        return activityDate;
    }
}
