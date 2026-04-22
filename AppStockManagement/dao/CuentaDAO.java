package dao;

import util.ConexionDB;
import model.*;
import java.sql.*;
import java.util.*;

/**
 * Clase DAO encargada de gestionar las operaciones sobre la tabla 'cuenta' en la BBDD.
 */
public class CuentaDAO {

    /**
     * Actualiza el saldo de una cuenta cuyo DNI de responsable o código se recibe como parámetro.
     *
     * @param codigoCuenta Código de la cuenta
     * @param nuevoSaldo Nuevo saldo a actualizar
     * @throws SQLException Si hay error en la actualización
     */
    public static void actualizarSaldo(String codigoCuenta, double nuevoSaldo) throws SQLException {
        String sql = "UPDATE cuenta SET saldo = ? WHERE codigo = ?";
        try (Connection con = ConexionDB.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDouble(1, nuevoSaldo);
            ps.setString(2, codigoCuenta);
            ps.executeUpdate();
        }
    }

    /**
     * Inserta en BBDD una cuenta recibida como parámetro.
     *
     * @param c Cuenta a insertar
     * @throws SQLException Si hay error en la inserción
     */
    public static void crearCuenta(Cuenta c) throws SQLException {
        String sql = "INSERT INTO cuenta (codigo, dni_responsable, departamento, saldo) " +
                "VALUES (?, ?, ?, ?)";
        try (Connection con = ConexionDB.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, c.getCodigo());
            ps.setString(2, c.getDniResponsable());
            ps.setString(3, c.getDpto());
            ps.setDouble(4, c.getSaldo());
            ps.executeUpdate();
        }
    }

    /**
     * Obtiene la Cuenta asociada a un DNI de responsable o un código.
     * Recupera todos los datos de la cuenta (código, saldo, productos y transacciones).
     *
     * @param criterio DNI o código de cuenta
     * @return Cuenta recuperada de BBDD o null si no existe
     * @throws SQLException Si hay error en la consulta
     */
    public static Cuenta obtenerCuenta(String criterio) throws SQLException {
        String sql = "SELECT codigo, dni_responsable, departamento, saldo FROM cuenta " +
                "WHERE dni_responsable = ? OR codigo = ?";
        try (Connection con = ConexionDB.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, criterio);
            ps.setString(2, criterio);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String codigo = rs.getString("codigo");
                String dni = rs.getString("dni_responsable");
                String dpto = rs.getString("departamento");
                double saldo = rs.getDouble("saldo");

                // Obtener productos y transacciones de esta cuenta
                Set<Producto> productos = ProductoDAO.obtenerProductos(codigo);
                Set<Transaccion> transacciones = TransaccionDAO.obtenerTransacciones(codigo);

                return new Cuenta(codigo, dni, dpto, saldo, productos, transacciones);
            }
            return null;
        }
    }

    /**
     * Obtiene de BBDD el número total de cuentas administradas.
     *
     * @return Número total de cuentas
     * @throws SQLException Si hay error en la consulta
     */
    public static int obtenerNumeroCuentas() throws SQLException {
        String sql = "SELECT COUNT(*) FROM cuenta";
        try (Connection con = ConexionDB.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 0;
        }
    }

    /**
     * Obtiene de BBDD el saldo inicial asociado a un determinado departamento.
     *
     * @param dpto Nombre del departamento
     * @return Saldo inicial del departamento
     * @throws SQLException Si hay error en la consulta
     */
    public static double obtenerSaldoInicial(String dpto) throws SQLException {
        String sql = "SELECT saldo_inicial FROM departamento WHERE nombre = ?";
        try (Connection con = ConexionDB.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, dpto);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getDouble("saldo_inicial");
            }
            throw new SQLException("Departamento " + dpto + " no encontrado");
        }
    }

    /**
     * Trunca (borra todos los registros) de la tabla cuenta.
     * Se usa en CargaDatos para limpiar antes de insertar.
     *
     * @throws SQLException Si hay error en la operación
     */
    public static void truncarCuentas() throws SQLException {
        String sql = "TRUNCATE TABLE cuenta CASCADE";
        try (Connection con = ConexionDB.getConnection();
             Statement st = con.createStatement()) {
            st.executeUpdate(sql);
        }
    }
}