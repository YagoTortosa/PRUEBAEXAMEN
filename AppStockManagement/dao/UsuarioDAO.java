package dao;

import util.ConexionDB;
import java.sql.*;

/**
 * Clase DAO encargada de gestionar las operaciones sobre la tabla 'usuario' en la BBDD.
 */
public class UsuarioDAO {

    /**
     * Valida las credenciales de usuario recibidas como parámetro.
     * Compara el usuario y contraseña con los datos almacenados en BBDD.
     *
     * @param userEnt Usuario introducido por consola
     * @param passEnt Contraseña introducida por consola
     * @return true si las credenciales son válidas, false en caso contrario
     * @throws SQLException Si hay error en la consulta
     */
    public static boolean validarCredenciales(String userEnt, String passEnt) throws SQLException {
        String sql = "SELECT password FROM usuario WHERE nombre_usuario = ?";
        try (Connection con = ConexionDB.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, userEnt);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String passBD = rs.getString("password");
                return passBD.equals(passEnt);
            } else {
                return false;
            }
        }
    }

    /**
     * Inserta un nuevo usuario en la tabla 'usuario'.
     *
     * @param nombreUsuario Nombre del usuario
     * @param password Contraseña del usuario
     * @throws SQLException Si hay error en la inserción
     */
    public static void insertarUsuario(String nombreUsuario, String password) throws SQLException {
        String sql = "INSERT INTO usuario (nombre_usuario, password) VALUES (?, ?)";
        try (Connection con = ConexionDB.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombreUsuario);
            ps.setString(2, password);
            ps.executeUpdate();
        }
    }

    /**
     * Trunca (borra todos los registros) de la tabla usuario.
     * Se usa en CargaDatos para limpiar antes de insertar.
     *
     * @throws SQLException Si hay error en la operación
     */
    public static void truncarUsuarios() throws SQLException {
        String sql = "TRUNCATE TABLE usuario CASCADE";
        try (Connection con = ConexionDB.getConnection();
             Statement st = con.createStatement()) {
            st.executeUpdate(sql);
        }
    }
}