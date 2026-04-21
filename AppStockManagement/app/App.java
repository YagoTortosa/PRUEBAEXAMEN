package app;

import dao.Cuenta;
import dao.Departamento;
import dao.Producto;
import dao.Transaccion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class App {
    private String nombreEmpresa;
    private Set<Cuenta> cuentas;

    String ANSI_RED    = "\u001B[31m";
    String ANSI_GREEN  = "\u001B[32m";
    String ANSI_YELLOW = "\u001B[33m";
    String ANSI_BLUE   = "\u001B[34m";
    String ANSI_PURPLE = "\u001B[35m";

    private final Scanner sc = new Scanner(System.in);

    static final String superUsuario    = "q";
    static final String superContrasenya = "1";

    public App(String nombreEmpresa) {
        validarNombreEmpresa(nombreEmpresa);
        this.nombreEmpresa = nombreEmpresa;
        this.cuentas = new HashSet<>();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        validarNombreEmpresa(nombreEmpresa);
        this.nombreEmpresa = nombreEmpresa;
    }

    public Set<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(Set<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }


    // ─── MÉTODOS AUXILIARES PRIVADOS ────────────────────────────────────────────

    /**
     * CORRECCIÓN: método encapsulado para buscar una cuenta por DNI o código.
     * Antes este bucle se repetía en crearCuenta, consultarCuenta,
     * consultarTransacciones y realizarTransacciones.
     */
    private Cuenta buscarCuenta(String buscador) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getDniResponsable().equals(buscador) || cuenta.getCodigo().equals(buscador)) {
                return cuenta;
            }
        }
        return null;
    }

    /**
     * CORRECCIÓN: comprueba si ya existe alguna cuenta con ese DNI.
     * Evita duplicidades en crearCuenta.
     */
    private boolean existeCuentaConDNI(String dni) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getDniResponsable().equals(dni)) {
                return true;
            }
        }
        return false;
    }


    // ─── LOGIN ───────────────────────────────────────────────────────────────────

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

            if (usuario.equals(superUsuario) && contrasenya.equals(superContrasenya)) {
                System.out.println(ANSI_BLUE + "** Bienvenido a DAW Stock Management **");
                return true;
            } else {
                System.out.println(ANSI_YELLOW + "User o pass incorrectos, quedan " + (intentos - 1) + " intentos.");
                intentos--;
            }
        } while (intentos > 0);

        System.out.println(ANSI_RED + "Has agotado el número de intentos.");
        return false;
    }


    // ─── MENÚ ────────────────────────────────────────────────────────────────────

    public void menu() {
        int opcion = 0;

        do {
            // CORRECCIÓN: se muestra el número de cuentas administradas
            System.out.println(ANSI_BLUE + "--- Menú Principal --- [Cuentas administradas: " + cuentas.size() + "]");
            System.out.println(ANSI_BLUE + "1. Crear cuenta");
            System.out.println(ANSI_BLUE + "2. Consultar cuenta");
            System.out.println(ANSI_BLUE + "3. Consultar transacciones");
            System.out.println(ANSI_BLUE + "4. Realizar transacciones");
            System.out.println(ANSI_BLUE + "5. Salir");

            try {
                System.out.print(ANSI_BLUE + "Selecciona una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                if (opcion < 1 || opcion > 5) {
                    System.out.println(ANSI_RED + "Opción no válida! Por favor, selecciona una opción del 1 al 5.");
                    System.out.println();
                    continue;
                }
            } catch (InputMismatchException e) {
                // CORRECCIÓN: antes hacía break y terminaba el programa.
                // Ahora limpiamos el buffer y continuamos el bucle.
                sc.nextLine();
                System.out.println(ANSI_RED + "Entrada no válida! Solo se permite un número del 1 al 5.");
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

            // Validamos el DNI primero; si falla lanzará excepción antes de pedir DPTO
            Cuenta.validarDNI(dni);

            // CORRECCIÓN: no se permite crear una cuenta si ya existe una con ese DNI
            if (existeCuentaConDNI(dni)) {
                System.out.println(ANSI_RED + "Ya existe una cuenta asociada a ese DNI.");
                System.out.println();
                return;
            }

            System.out.print(ANSI_BLUE + "Departamento (MARKETING, DIRECCION, INFORMATICA, RRHH): ");
            String dptoTexto = sc.nextLine().toUpperCase().trim();

            Departamento dpto = Departamento.valueOf(dptoTexto); // puede lanzar IllegalArgumentException

            Cuenta nuevaCuenta = new Cuenta(dni, dpto);
            cuentas.add(nuevaCuenta);
            System.out.println(ANSI_GREEN + "Cuenta " + nuevaCuenta.getCodigo() + " creada correctamente.");
            System.out.println();

        } catch (IllegalArgumentException e) {
            // CORRECCIÓN: mensaje genérico en vez de "Departamento no válido" cuando el error es el DNI
            System.out.println(ANSI_RED + "Datos no válidos. Comprueba el DNI (8 dígitos + letra) y el departamento (MARKETING, DIRECCION, INFORMATICA, RRHH).");
            System.out.println();
        }
    }

    private void consultarCuenta() {
        System.out.print(ANSI_BLUE + "Introduce DNI o código de cuenta: ");
        String buscador = sc.nextLine();

        // CORRECCIÓN: se usa el método encapsulado buscarCuenta(); ya no se valida
        // el buscador como DNI (porque también puede ser un código de cuenta).
        Cuenta cuenta = buscarCuenta(buscador);

        if (cuenta != null) {
            cuenta.imprimirDatosCuenta();
            System.out.println();
            cuenta.imprimirProductos();
        } else {
            // CORRECCIÓN: mensaje genérico válido tanto para DNI como para código
            System.out.println(ANSI_RED + "No se encontró ninguna cuenta con ese identificador.");
            System.out.println();
        }
    }

    private void consultarTransacciones() {
        System.out.print(ANSI_BLUE + "Introduce DNI o código de cuenta: ");
        String buscador = sc.nextLine();

        // CORRECCIÓN: se usa el método encapsulado buscarCuenta()
        Cuenta cuenta = buscarCuenta(buscador);

        if (cuenta != null) {
            System.out.println(ANSI_BLUE + "Transacciones a fecha " +
                    LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + ":");

            List<Transaccion> listaInversa = new ArrayList<>(cuenta.getTransacciones());
            Collections.reverse(listaInversa);

            for (Transaccion transaccion : listaInversa) {
                transaccion.imprimirTransaccion();
            }

            System.out.println(ANSI_BLUE + "------------------------------------");
            System.out.println();
        } else {
            // CORRECCIÓN: el mensaje estaba DENTRO del for → aparecía con la primera cuenta
            // que no coincidía. Ahora está fuera, y solo se muestra si no se encontró ninguna.
            System.out.println(ANSI_RED + "No hay transacciones asociadas a ese identificador.");
            System.out.println();
        }
    }

    private void realizarTransacciones() {
        System.out.println();
        System.out.println(ANSI_BLUE + "----------------------------");
        System.out.print(ANSI_BLUE + "Introduce DNI o código de cuenta: ");
        String buscador = sc.nextLine();

        // CORRECCIÓN: se usa el método encapsulado buscarCuenta()
        Cuenta cuenta = buscarCuenta(buscador);

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

            case 1 -> {
                try {
                    System.out.print(ANSI_BLUE + "Código: ");
                    String codigoProducto = sc.nextLine();
                    Cuenta.validarCodigo(codigoProducto); // valida antes de pedir más datos

                    System.out.print(ANSI_BLUE + "Nombre: ");
                    String nombreProducto = sc.nextLine();
                    Cuenta.validarCodigo(nombreProducto); // reutilizamos validarCodigo para nombre no vacío

                    System.out.print(ANSI_BLUE + "Precio: ");
                    double precioProducto;
                    try {
                        // CORRECCIÓN: capturamos InputMismatchException si el precio no es numérico
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

            case 2 -> {
                for (Producto prod : cuenta.getProductos()) {
                    System.out.println("\t" + ANSI_BLUE + "->" + prod.getCodigo() + " / " + prod.getNombre());
                }

                try {
                    System.out.print(ANSI_BLUE + "Código a dar de baja: ");
                    String codigoAEliminar = sc.nextLine();
                    Cuenta.validarCodigo(codigoAEliminar);

                    // CORRECCIÓN: antes el else estaba DENTRO del for, así que en cuanto
                    // el primer producto del Set no coincidía, mostraba "código no existe".
                    // Ahora usamos buscarCuenta-style: buscamos el producto primero y
                    // solo mostramos el error si realmente no existe.
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