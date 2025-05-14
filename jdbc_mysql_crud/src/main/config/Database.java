package main.config;
import com.mysql.jdbc.Connection; // Perhatikan ini, mungkin perlu disesuaikan dengan driver yang kamu gunakan
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Connection connection;
    private static final String dbUrl = "jdbc:mysql://localhost:3306/db_praktikum";
    private static final String user = "root";
    private static final String password = "";

    public static Connection DBConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver()); // Perhatikan ini
                connection = (Connection) DriverManager.getConnection(dbUrl, user, password);
                System.out.println("Koneksi berhasil!");
            }
        } catch (SQLException exc) {
            System.err.println("Koneksi error : " + exc.getMessage());
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Koneksi ditutup.");
            }
        } catch (SQLException exc) {
            System.err.println("FAILED TO CLOSE DATABASE CONNECTION : " + exc.getMessage());
        }
    }
}