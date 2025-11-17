package edu.najah.cap.advance.design_priniciples.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.crypto.Data;

public class DatabaseFactory {


    public static Database getDatabase(String type) {
        Database database = null;

        if ("mysql".equals(type)) {
            database = new MySqlDatabase();
        } else if ("sqLite".equals(type)) {
            database = new SqLiteDatabase();
        } else if ("postgress".equals(type)) {
            database = new PostgressDatabase();
        } else {
            throw new RuntimeException(String.format("This type (%s)  of database is not supported", type));
        }

        return database;
    }
}
