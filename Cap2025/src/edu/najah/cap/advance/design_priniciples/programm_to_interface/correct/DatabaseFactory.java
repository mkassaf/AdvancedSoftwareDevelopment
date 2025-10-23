package edu.najah.cap.advance.design_priniciples.programm_to_interface.correct;

public class DatabaseFactory {

    public static Database getDatabase(DatabaseType type) {
        switch (type) {
            case DatabaseType.MYSQL:
                return new MySQLDatabase();
            case DatabaseType.POSTGRES:
                return new PostgressDatabase();
            case DatabaseType.MY_CUSTOM:
                return new MyCustomMySQL();
        }
        throw new IllegalArgumentException("Invalid database type");

    }
}
