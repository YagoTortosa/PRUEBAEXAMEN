package app;

import dao.*;
import model.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Clase 'AppStock' que contiene el menú principal y la lógica de todas las funciones de la aplicación.
 */
public class AppStock {
    private String nombreEmpresa;

    String ANSI_RED    = "\u001B[31m";
    String ANSI_GREEN  = "\u001B[32m";
    String ANSI_YELLOW = "\u001B[33m";
    String ANSI_BLUE   = "\u001B[34m";
    String ANSI_PURPLE = "\u001B[35m";

    private final Scanner sc = new Scanner(System.in);

    public AppStock(String nombreEmpresa) {
        validarNombreEmpresa(nombreEmpresa);
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        validarNombreEmpresa(nombreEmpresa);
        this.nombreEmpresa = nombreEmpresa;
    }

    // ─── LOGIN ───────────────────────────────────────────────────────────────────

    /**
     * Valida las credenciales del usuario contra la BBDD.
     * Permite 3 intentos.
     *
     * @return true si login correcto, false si agotados intentos
     */
    public boolean login() {
        int intentos = 3;

        System.out.println(ANSI_BLUE + "Acceso a DAW Stock Management");
        System.out.println(ANSI_BLUE + "==============================");

        do {
            System.out.print(ANSI_BLUE + "Introduce tu usuario: ");
            String usuario = sc.nextLine();
            System.out.print(ANSI_BLUE + "Introduce tu contraseña: ");
            String contrasenya = sc.nextLine();
            System.out.println();

            try {
                if (UsuarioDAO.validarCredenciales(usuario, contrasenya)) {
                    System.out.println(ANSI_BLUE + "** Bienvenido a DAW Stock Management **");
                    return true;
                } else {
                    System.out.println(ANSI_YELLOW + "User o pass incorrectos, quedan " + (intentos - 1) + " intentos.");
                    intentos--;
                }
            } catch (SQLException e) {
                System.err.println(ANSI_RED + "Error al validar credenciales: " + e.getMessage());
                return false;
            }
        } while (intentos > 0);

        System.out.println(ANSI_RED + "Has agotado el número de intentos.");
        return false;
    }

    // ─── MENÚ ────────────────────────────────────────────────────────────────────

    /**
     * Muestra el menú principal de la aplicación.
     */
    public void menu() {
        int opcion = 0;

        do {
            try {
                int numeroCuentas = CuentaDAO.obtenerNumeroCuentas();
                System.out.println(ANSI_BLUE + "--- Menú Principal --- [Cuentas administradas: " + numeroCuentas + "]");
                System.out.println(ANSI_BLUE + "1. Crear cuenta");
                System.out.println(ANSI_BLUE + "2. Consultar cuenta");
                System.out.println(ANSI_BLUE + "3. Consultar transacciones");
                System.out.println(ANSI_BLUE + "4. Realizar transacciones");
                System.out.println(ANSI_BLUE + "5. Salir");

                System.out.print(ANSI_BLUE + "Selecciona una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                if (opcion < 1 || opcion > 5) {
                    System.out.println(ANSI_RED + "Opción no válida! Por favor, selecciona una opción del 1 al 5.");
                    System.out.println();
                    continue;
                }
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println(ANSI_RED + "Entrada no válida! Solo se permite un número del 1 al 5.");
                System.out.println();
                continue;
            } catch (SQLException e) {
                System.err.println(ANSI_RED + "Error al obtener cuentas: " + e.getMessage());
                System.out.println();
                continue;
            }

            switch (opcion) {
                case 1 -> crearCuenta();
                case 2 -> consultarCuenta();
                case 3 -> consultarTransacciones();
                case 4 -> realizarTransacciones();
                case 5 -> {
                    System.out.println(ANSI_RED + "Saliendo del programa. ¡Hasta luego!");
                    System.out.println();
                }
            }
        } while (opcion != 5);
    }

    // ─── OPCIONES DEL MENÚ ───────────────────────────────────────────────────────

    private void crearCuenta() {
        try {
            System.out.print(ANSI_BLUE + "DNI del responsable: ");
            String dni = sc.nextLine();

            Cuenta.validarDNI(dni);

            // Verificar si ya existe DNI
            if (CuentaDAO.obtenerCuenta(dni) != null) {
                System.out.println(ANSI_RED + "Ya existe una cuenta asociada a ese DNI.");
                System.out.println();
                return;
            }

            System.out.print(ANSI_BLUE + "Departamento (MARKETING, DIRECCION, INFORMATICA, RRHH): ");
            String dptoTexto = sc.nextLine().toUpperCase().trim();

            // Validar departamento
            Cuenta.validarDepartamento(dptoTexto);

            Cuenta nuevaCuenta = new Cuenta(dni, dptoTexto);
            CuentaDAO.crearCuenta(nuevaCuenta);
            System.out.println(ANSI_GREEN + "Cuenta " + nuevaCuenta.getCodigo() + " creada correctamente.");
            System.out.println();

        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Datos no válidos: " + e.getMessage());
            System.out.println();
        } catch (SQLException e) {
            System.err.println(ANSI_RED + "Error al crear cuenta: " + e.getMessage());
            System.out.println();
        }
    }

    private void consultarCuenta() {
        System.out.print(ANSI_BLUE + "Introduce DNI o código de cuenta: ");
        String buscador = sc.nextLine();

        try {
            Cuenta cuenta = CuentaDAO.obtenerCuenta(buscador);

            if (cuenta != null) {
                cuenta.imprimirDatosCuenta();
                System.out.println();
                cuenta.imprimirProductos();
            } else {
                System.out.println(ANSI_RED + "No se encontró ninguna cuenta con ese identificador.");
                System.out.println();
            }
        } catch (SQLException e) {
            System.err.println(ANSI_RED + "Error al consultar cuenta: " + e.getMessage());
            System.out.println();
        }
    }

    private void consultarTransacciones() {
        System.out.print(ANSI_BLUE + "Introduce DNI o código de cuenta: ");
        String buscador = sc.nextLine();

        try {
            Cuenta cuenta = CuentaDAO.obtenerCuenta(buscador);

            if (cuenta != null) {
                System.out.println(ANSI_BLUE + "Transacciones a fecha " +
                        LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + ":");

                Set<Transaccion> transacciones = cuenta.getTransacciones();
                if (transacciones.isEmpty()) {
                    System.out.println(ANSI_YELLOW + "No hay transacciones para esta cuenta.");
                } else {
                    for (Transaccion transaccion : transacciones) {
                        transaccion.imprimirTransaccion();
                    }
                }

                System.out.println(ANSI_BLUE + "------------------------------------");
                System.out.println();
            } else {
                System.out.println(ANSI_RED + "No hay transacciones asociadas a ese identificador.");
                System.out.println();
            }
        } catch (SQLException e) {
            System.err.println(ANSI_RED + "Error al consultar transacciones: " + e.getMessage());
            System.out.println();
        }
    }

    private void realizarTransacciones() {
        System.out.println();
        System.out.println(ANSI_BLUE + "----------------------------");
        System.out.print(ANSI_BLUE + "Introduce DNI o código de cuenta: ");
        String buscador = sc.nextLine();

        try {
            Cuenta cuenta = CuentaDAO.obtenerCuenta(buscador);

            if (cuenta == null) {
                System.out.println(ANSI_RED + "No se encontró ninguna cuenta con ese identificador.");
                System.out.println();
                return;
            }

            System.out.println(ANSI_BLUE + "1. Alta");
            System.out.println(ANSI_BLUE + "2. Baja");
            System.out.print(ANSI_BLUE + "Elige una opción: ");

            int opcionTransaccion;
            try {
                opcionTransaccion = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println(ANSI_RED + "Opción no válida!");
                System.out.println();
                return;
            }

            if (opcionTransaccion < 1 || opcionTransaccion > 2) {
                System.out.println(ANSI_RED + "Opción no válida!");
                System.out.println();
                return;
            }

            switch (opcionTransaccion) {
                case 1 -> altaProducto(cuenta);
                case 2 -> bajaProducto(cuenta);
            }
        } catch (SQLException e) {
            System.err.println(ANSI_RED + "Error al realizar transacciones: " + e.getMessage());
            System.out.println();
        }
    }

    private void altaProducto(Cuenta cuenta) {
        try {
            System.out.print(ANSI_BLUE + "Código: ");
            String codigoProducto = sc.nextLine();
            Cuenta.validarCodigo(codigoProducto);

            System.out.print(ANSI_BLUE + "Nombre: ");
            String nombreProducto = sc.nextLine();
            Cuenta.validarCodigo(nombreProducto);

            System.out.print(ANSI_BLUE + "Precio: ");
            double precioProducto;
            try {
                precioProducto = sc.nextDouble();
                sc.nextLine();
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println(ANSI_RED + "El precio introducido no es un número válido.");
                System.out.println();
                return;
            }

            validarPrecio(precioProducto);

            Producto nuevoProducto = new Producto(codigoProducto, nombreProducto, precioProducto);
            cuenta.alta(nuevoProducto);
            System.out.println(ANSI_GREEN + "*Alta de " + nombreProducto + " realizada exitosamente.*");
            System.out.println();

        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Error al dar de alta: " + e.getMessage());
            System.out.println();
        }
    }

    private void bajaProducto(Cuenta cuenta) {
        try {
            for (Producto prod : cuenta.getProductos()) {
                System.out.println("\t" + ANSI_BLUE + "->" + prod.getCodigo() + " / " + prod.getNombre());
            }

            System.out.print(ANSI_BLUE + "Código a dar de baja: ");
            String codigoAEliminar = sc.nextLine();
            Cuenta.validarCodigo(codigoAEliminar);

            boolean encontrado = false;
            for (Producto prod : cuenta.getProductos()) {
                if (prod.getCodigo().equals(codigoAEliminar)) {
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                cuenta.baja(codigoAEliminar);
                System.out.println(ANSI_GREEN + "*Baja del producto con código " + codigoAEliminar + " realizada exitosamente.*");
            } else {
                System.out.println(ANSI_RED + "El código no existe.");
            }
            System.out.println();

        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Entrada no válida.");
            System.out.println();
        }
    }

    // ─── MÉTODOS AUXILIARES ──────────────────────────────────────────────────────

    static void validarNombreEmpresa(String nombreEmpresa) {
        if (nombreEmpresa == null || nombreEmpresa.isEmpty())
            throw new IllegalArgumentException("El nombre no puede ser nulo ni estar vacío");
    }

    static void validarPrecio(double precio) {
        if (precio < 0)
            throw new IllegalArgumentException("El precio no puede ser negativo");
    }
}