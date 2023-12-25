package edu.najah.cap.activity;

import edu.najah.cap.exceptions.BadRequestException;
import edu.najah.cap.exceptions.NotFoundException;
import edu.najah.cap.exceptions.SystemBusyException;

import java.util.List;

public interface IUserActivityService {

    void addUserActivity(UserActivity userActivity);

    List<UserActivity> getUserActivity(String userId) throws SystemBusyException, BadRequestException, NotFoundException;

    void removeUserActivity(String userId, String id) throws SystemBusyException, BadRequestException, NotFoundException;
}
