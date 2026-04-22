package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase DAO encargada de gestionar la conexión a la BBDD con PostgreSQL.
 * Utiliza el patrón Singleton para obtener una única conexión.
 */
public class ConexionDB {

    private static final String URL = "jdbc:postgresql://localhost:5432/stockdb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1234";
    private static final String DRIVER = "org.postgresql.Driver";

    /**
     * Obtención de la cadena de conexión a BBDD a través del DriverManager y las
     * credenciales de acceso al SGBD.
     *
     * @return Conexión a la base de datos
     * @throws SQLException Si hay error en la conexión
     */
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver PostgreSQL no encontrado", e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}