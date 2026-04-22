package dao;

import util.ConexionDB;
import java.sql.*;
import java.util.*;

/**
 * Clase DAO encargada de gestionar las operaciones sobre la tabla 'departamento' en la BBDD.
 */
public class DepartamentoDAO {

    /**
     * Obtiene el nombre del departamento a partir de un id recibido como parámetro.
     *
     * @param id ID del departamento
     * @return Nombre del departamento o null si no existe
     * @throws SQLException Si hay error en la consulta
     */
    public static String obtenerDepartamentoForId(int id) throws SQLException {
        String sql = "SELECT nombre FROM departamento WHERE id = ?";
        try (Connection con = ConexionDB.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString("nombre");
            }
            return null;
        }
    }

    /**
     * Obtiene una lista dinámica de los nombres de los departamentos existentes en BBDD.
     *
     * @return List de nombres de departamentos
     * @throws SQLException Si hay error en la consulta
     */
    public static List<String> obtenerDepartamentos() throws SQLException {
        List<String> departamentos = new ArrayList<>();
        String sql = "SELECT nombre FROM departamento ORDER BY nombre";
        try (Connection con = ConexionDB.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                departamentos.add(rs.getString("nombre"));
            }
        }
        return departamentos;
    }

    /**
     * Obtiene el id del departamento a partir de un nombre recibido como parámetro.
     *
     * @param dpto Nombre del departamento
     * @return ID del departamento o -1 si no existe
     * @throws SQLException Si hay error en la consulta
     */
    public static int obtenerIdDepartamentoForNombre(String dpto) throws SQLException {
        String sql = "SELECT id FROM departamento WHERE nombre = ?";
        try (Connection con = ConexionDB.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, dpto);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }
            return -1;
        }
    }

    /**
     * Valida si un nombre de departamento introducido por consola existe en BBDD.
     *
     * @param dpto Nombre del departamento a validar
     * @return true si existe, false en caso contrario
     * @throws SQLException Si hay error en la consulta
     */
    public static boolean validarDepartamento(String dpto) throws SQLException {
        String sql = "SELECT COUNT(*) FROM departamento WHERE nombre = ?";
        try (Connection con = ConexionDB.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, dpto);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
            return false;
        }
    }

    /**
     * Inserta un nuevo departamento en la tabla 'departamento'.
     *
     * @param nombre Nombre del departamento
     * @param saldoInicial Saldo inicial del departamento
     * @throws SQLException Si hay error en la inserción
     */
    public static void insertarDepartamento(String nombre, double saldoInicial) throws SQLException {
        String sql = "INSERT INTO departamento (nombre, saldo_inicial) VALUES (?, ?)";
        try (Connection con = ConexionDB.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setDouble(2, saldoInicial);
            ps.executeUpdate();
        }
    }

    /**
     * Trunca (borra todos los registros) de la tabla departamento.
     * Se usa en CargaDatos para limpiar antes de insertar.
     *
     * @throws SQLException Si hay error en la operación
     */
    public static void truncarDepartamentos() throws SQLException {
        String sql = "TRUNCATE TABLE departamento CASCADE";
        try (Connection con = ConexionDB.getConnection();
             Statement st = con.createStatement()) {
            st.executeUpdate(sql);
        }
    }
}