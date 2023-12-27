package edu.najah.cap.exceptions;

import java.time.Instant;

public class Util {
    private Util() {
    }
    private static boolean skipValidation = false;
    public static void validateUserName(String userName) throws SystemBusyException, BadRequestException {
        if (skipValidation) {
            return;
        }
        if (userName == null || userName.isEmpty()) {
            throw new BadRequestException("User name is required");
        }
        if (userName.length() < 4) {
            throw new BadRequestException("User name must be at least 4 characters");
        }
        if (!userName.startsWith("user")) {
            throw new BadRequestException("User name must start with 'user'");
        }
        if (Instant.now().getEpochSecond() % 3 == 0) {
            throw new SystemBusyException("Something went wrong");
        }

    }
    public static void setSkipValidation(boolean skipValidation) {
        Util.skipValidation = skipValidation;
    }
}
