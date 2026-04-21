import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL = "jdbc:postgresql://localhost:5432/stockdb";
    private static final String USER = "postgres";
    private static final String PASS = "postgres";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
    public static void main(String[] args) {
        try (Connection con = getConnection()) {
            System.out.println("Conexión exitosa a PostgreSQL");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
