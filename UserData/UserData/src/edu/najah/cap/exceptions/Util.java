package edu.najah.cap.exceptions;

import java.time.Instant;

public class Util {
    private Util() {
    }

    public static void validateUserName(String userName) throws SystemBusyException, BadRequestException {
        if (userName == null || userName.isEmpty()) {
            throw new BadRequestException("User name is required");
        }
        if (userName.length() < 3) {
            throw new BadRequestException("User name must be at least 3 characters");
        }
        if (Instant.now().getEpochSecond() % 3 == 0) {
            throw new SystemBusyException("Something went wrong");
        }

    }
}
