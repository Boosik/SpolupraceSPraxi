package me.vranek;

import static me.vranek.DatabaseStructure.getTables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
        // initialize sqlite database and create tables if missing
        initDatabase();
    }

    private void initDatabase() {
        System.out.println("Initializing database");
        Connection c;
        Statement stmt;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:sample.db");

            System.out.println("Initializing tables");
            stmt = c.createStatement();
            for (String tableName : getTables().keySet()) {
                System.out.println("Initializing table: " + tableName);
                String table = getTables().get(tableName);
                stmt.executeUpdate(table);
            }
            stmt.close();
            c.close();
            System.out.println("Initialization complete, starting GUI");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
