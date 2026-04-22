package util;

import dao.*;
import model.*;
import java.sql.SQLException;

/**
 * Clase 'CargaDatos' que realiza toda la carga inicial de datos en la aplicación.
 */
public class CargaDatos {

    /**
     * Borra todos los datos de las tablas: Usuario, Departamento, Cuenta, Producto, Transaccion
     */
    public static void borrarDatos() {
        try {
            TransaccionDAO.truncarTransacciones();
            ProductoDAO.truncarProductos();
            CuentaDAO.truncarCuentas();
            DepartamentoDAO.truncarDepartamentos();
            UsuarioDAO.truncarUsuarios();
            System.out.println("✓ Datos borrados correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al borrar datos: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Inserta un usuario en la BBDD para las credenciales de login.
     */
    public static void insertarUsuario() {
        try {
            UsuarioDAO.insertarUsuario("q", "1");
            System.out.println("✓ Usuario 'q' con contraseña '1' insertado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al insertar usuario: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Inserta los departamentos con sus saldos iniciales.
     * MARKETING: 3.500 €
     * DIRECCION: 15.000 €
     * INFORMATICA: 10.000 €
     * RRHH: 5.000 €
     */
    public static void insertarDepartamentos() {
        try {
            DepartamentoDAO.insertarDepartamento("MARKETING", 3500.0);
            DepartamentoDAO.insertarDepartamento("DIRECCION", 15000.0);
            DepartamentoDAO.insertarDepartamento("INFORMATICA", 10000.0);
            DepartamentoDAO.insertarDepartamento("RRHH", 5000.0);
            System.out.println("✓ Departamentos insertados correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al insertar departamentos: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Inserta varias cuentas iniciales (una por departamento)
     */
    public static void insertarCuentas() {
        try {
            Cuenta cta1 = new Cuenta("11111111A", "MARKETING");
            CuentaDAO.crearCuenta(cta1);

            Cuenta cta2 = new Cuenta("22222222B", "DIRECCION");
            CuentaDAO.crearCuenta(cta2);

            Cuenta cta3 = new Cuenta("33333333C", "INFORMATICA");
            CuentaDAO.crearCuenta(cta3);

            Cuenta cta4 = new Cuenta("44444444D", "RRHH");
            CuentaDAO.crearCuenta(cta4);

            System.out.println("✓ Cuentas insertadas correctamente.");
        } catch (SQLException | IllegalArgumentException e) {
            System.err.println("Error al insertar cuentas: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Inserta transacciones de prueba asociadas a las cuentas creadas.
     * Esta función será llamada después de que las cuentas y productos estén listos.
     */
    public static void insertarTransacciones() {
        // Las transacciones se crearán automáticamente al hacer alta y baja de productos
        System.out.println("✓ Transacciones insertadas (se generan con altas y bajas).");
    }

    /**
     * Método main que ejecuta toda la precarga de datos.
     */
    public static void main(String[] args) {
        System.out.println("\n========== CARGA INICIAL DE DATOS ==========\n");
        borrarDatos();
        insertarUsuario();
        insertarDepartamentos();
        insertarCuentas();
        insertarTransacciones();
        System.out.println("\n========== CARGA COMPLETADA ==========\n");
    }
}