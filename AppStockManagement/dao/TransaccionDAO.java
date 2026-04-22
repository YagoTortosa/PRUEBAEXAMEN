package dao;

import util.ConexionDB;
import model.Transaccion;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Clase DAO encargada de gestionar las operaciones sobre la tabla 'transaccion' en la BBDD.
 */
public class TransaccionDAO {

    /**
     * Inserta una Transaccion en la cuenta cuyo código se recibe como parámetro.
     *
     * @param t Transacción a insertar
     * @param codigoCuenta Código de la cuenta propietaria de la transacción
     * @throws SQLException Si hay error en la inserción
     */
    public static void insertarTransaccion(Transaccion t, String codigoCuenta) throws SQLException {
        String sql = "INSERT INTO transaccion (concepto, importe, saldo_actual, fecha, codigo_cuenta) " +
                "VALUES (?, ?, ?, ?, ?)";
        try (Connection con = ConexionDB.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, t.getConcepto());
            ps.setDouble(2, t.getImporte());
            ps.setDouble(3, t.getSaldoActual());
            ps.setTimestamp(4, Timestamp.valueOf(t.getFecha()));
            ps.setString(5, codigoCuenta);
            ps.executeUpdate();
        }
    }

    /**
     * Obtiene un conjunto (Set) de Transaccion asociadas a un determinado código de cuenta recibido como parámetro.
     *
     * @param codigoCuenta Código de la cuenta
     * @return Set de transacciones de la cuenta
     * @throws SQLException Si hay error en la consulta
     */
    public static Set<Transaccion> obtenerTransacciones(String codigoCuenta) throws SQLException {
        Set<Transaccion> transacciones = new LinkedHashSet<>();
        String sql = "SELECT concepto, importe, saldo_actual, fecha FROM transaccion " +
                "WHERE codigo_cuenta = ? ORDER BY fecha DESC";
        try (Connection con = ConexionDB.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, codigoCuenta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String concepto = rs.getString("concepto");
                double importe = rs.getDouble("importe");
                double saldoActual = rs.getDouble("saldo_actual");
                LocalDateTime fecha = rs.getTimestamp("fecha").toLocalDateTime();

                transacciones.add(new Transaccion(concepto, importe, saldoActual, fecha));
            }
        }
        return transacciones;
    }

    /**
     * Trunca (borra todos los registros) de la tabla transaccion.
     * Se usa en CargaDatos para limpiar antes de insertar.
     *
     * @throws SQLException Si hay error en la operación
     */
    public static void truncarTransacciones() throws SQLException {
        String sql = "TRUNCATE TABLE transaccion CASCADE";
        try (Connection con = ConexionDB.getConnection();
             Statement st = con.createStatement()) {
            st.executeUpdate(sql);
        }
    }
}