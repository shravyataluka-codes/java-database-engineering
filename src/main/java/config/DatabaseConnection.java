package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection getConnection() {
        try {



            String url = System.getenv("DB_URL");
            String user = System.getenv("DB_USER");
            String password = System.getenv("DB_PASSWORD");

            // Force driver registration
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            return DriverManager.getConnection(
                    url + "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                    user,
                    password
            );

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}