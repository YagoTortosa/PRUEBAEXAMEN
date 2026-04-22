package dao;

import util.ConexionDB;
import model.Producto;
import java.sql.*;
import java.util.*;

/**
 * Clase DAO encargada de gestionar las operaciones sobre la tabla 'producto' en la BBDD.
 */
public class ProductoDAO {

    /**
     * Elimina un Producto de la cuenta cuyo código se recibe como parámetro.
     *
     * @param p Producto a eliminar
     * @param codigoCuenta Código de la cuenta propietaria del producto
     * @throws SQLException Si hay error en la eliminación
     */
    public static void borrarProducto(Producto p, String codigoCuenta) throws SQLException {
        String sql = "DELETE FROM producto WHERE codigo = ? AND codigo_cuenta = ?";
        try (Connection con = ConexionDB.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, p.getCodigo());
            ps.setString(2, codigoCuenta);
            ps.executeUpdate();
        }
    }

    /**
     * Inserta un Producto en la cuenta cuyo código se recibe como parámetro.
     *
     * @param p Producto a insertar
     * @param codigoCuenta Código de la cuenta propietaria del producto
     * @throws SQLException Si hay error en la inserción
     */
    public static void insertarProducto(Producto p, String codigoCuenta) throws SQLException {
        String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_cuenta) " +
                "VALUES (?, ?, ?, ?)";
        try (Connection con = ConexionDB.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, p.getCodigo());
            ps.setString(2, p.getNombre());
            ps.setDouble(3, p.getPrecio());
            ps.setString(4, codigoCuenta);
            ps.executeUpdate();
        }
    }

    /**
     * Obtiene el Producto a partir de su código y un código de cuenta.
     *
     * @param codProd Código del producto
     * @param codigoCuenta Código de la cuenta propietaria
     * @return Producto recuperado o null si no existe
     * @throws SQLException Si hay error en la consulta
     */
    public static Producto obtenerProducto(String codProd, String codigoCuenta) throws SQLException {
        String sql = "SELECT codigo, nombre, precio FROM producto " +
                "WHERE codigo = ? AND codigo_cuenta = ?";
        try (Connection con = ConexionDB.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, codProd);
            ps.setString(2, codigoCuenta);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                return new Producto(codigo, nombre, precio);
            }
            return null;
        }
    }

    /**
     * Obtiene un conjunto (Set) de Producto asociados a un determinado código de cuenta recibido como parámetro.
     *
     * @param codigoCuenta Código de la cuenta
     * @return Set de productos de la cuenta
     * @throws SQLException Si hay error en la consulta
     */
    public static Set<Producto> obtenerProductos(String codigoCuenta) throws SQLException {
        Set<Producto> productos = new HashSet<>();
        String sql = "SELECT codigo, nombre, precio FROM producto WHERE codigo_cuenta = ?";
        try (Connection con = ConexionDB.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, codigoCuenta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                productos.add(new Producto(codigo, nombre, precio));
            }
        }
        return productos;
    }

    /**
     * Trunca (borra todos los registros) de la tabla producto.
     * Se usa en CargaDatos para limpiar antes de insertar.
     *
     * @throws SQLException Si hay error en la operación
     */
    public static void truncarProductos() throws SQLException {
        String sql = "TRUNCATE TABLE producto CASCADE";
        try (Connection con = ConexionDB.getConnection();
             Statement st = con.createStatement()) {
            st.executeUpdate(sql);
        }
    }
}