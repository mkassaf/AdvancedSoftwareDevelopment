package edu.najah.cap.main;

public class SystemBusyException extends RuntimeException {


    public SystemBusyException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {

        return "[2020:12:14 8:00 12s] ---- :: " + super.getMessage() ;
    }

}
