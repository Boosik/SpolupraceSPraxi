package me.vranek;

import java.util.HashMap;
import java.util.Map;

public class DatabaseStructure {

    private static Map<String, String> tables = new HashMap<>();

    static {
        tables.put("Company",
                "CREATE TABLE IF NOT EXISTS COMPANY " +
                        "(ID INT PRIMARY KEY     NOT NULL," +
                        " NAME           TEXT    NOT NULL, " +
                        " AGE            INT     NOT NULL, " +
                        " ADDRESS        CHAR(50), " +
                        " SALARY         REAL)");
    }

    public static Map<String, String> getTables() {
        return tables;
    }
}
