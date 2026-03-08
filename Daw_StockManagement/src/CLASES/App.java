import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class App {
    private String nombreEmpresa;
    private Set<Cuenta> cuentas;

    private final Scanner sc = new Scanner(System.in);

    static final String superUsuario = "q";
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


    // METODOS

    public boolean login() {
        int intentos = 3;

        System.out.println("Acceso a DAW Stock Management");
        System.out.println("==============================");

        do {
            System.out.print("Introduce tu usuario: ");
            String usuario = sc.nextLine();
            System.out.print("Introduce tu contraseña: ");
            String contrasenya = sc.nextLine();

            System.out.println();

            if (usuario.equals(superUsuario) && contrasenya.equals(superContrasenya)) {
                System.out.println("** Bienvenido a DAW Stock Management **");
                return true;
            } else {
                System.out.println("User o pass incorrectos, quedan " + (intentos - 1) + " intentos.");
                intentos--;
            }


        } while (intentos > 0);

        System.out.println("Has agotado el número de intentos.");
        return false;
    }



    public void menu() {
        int opcion  = 0;

        do {
            System.out.println("--- Menú Principal ---");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Consultar cuenta");
            System.out.println("3. Consultar transacciones");
            System.out.println("4. Realizar transacciones");
            System.out.println("5. Salir");

            try {
                System.out.print("Selecciona una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                if (opcion < 1 || opcion > 5) {
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 5.");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, introduce un número del 1 al 5.");
                continue;
            }


            switch (opcion) {
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    consultarCuenta();
                    break;
                case 3:
                    consultarTransacciones();
                    break;
                case 4:
                    realizarTransacciones();
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 5.");
            }
        } while (opcion != 5);


    }

    private void crearCuenta() {
        try {
            System.out.print("DNI del responsable: ");
            String dni = sc.nextLine();

            Cuenta.validarDNI(dni);

            System.out.print("Departamento: ");
            Departamento dpto = Departamento.valueOf(sc.nextLine().toUpperCase().trim());

            cuentas.add(new Cuenta(dni, dpto));
            System.out.println("Cuenta creada exitosamente");

        } catch (IllegalArgumentException e) {
            System.out.println("Departamento no válido. Por favor, introduce un departamento válido (MARKETING, DIRECCION, INFORMATICA, RRHH).");
        }
    }

    private void consultarCuenta() {
        try {
            System.out.print("Introduce dni o código de cuenta: ");
            String buscador = sc.nextLine();

            Cuenta.validarDNI(buscador);

            for (Cuenta cuenta : cuentas) {
                if (cuenta.getDniResponsable().equals(buscador) || cuenta.getCodigo().equals(buscador)) {
                    cuenta.imprimirDatosCuenta();
                    System.out.println();
                    cuenta.imprimirProductos();
                    break;
                } else {
                    System.out.println("No se encontró ninguna cuenta con ese DNI o código .");

                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("DNI no válido. Por favor, introduce un DNI válido (8 dígitos seguidos de una letra).");
        }





    }

    private void consultarTransacciones() {
        try {
            System.out.print("Introduce dni o código de cuenta: ");
            String buscador = sc.nextLine();

            Cuenta.validarDNI(buscador);

            for (Cuenta cuenta : cuentas) {
                if (cuenta.getDniResponsable().equals(buscador) || cuenta.getCodigo().equals(buscador)) {
                    System.out.println("Transacciones a fecha " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + ":");

                    List<Transaccion> listaInversa = new ArrayList<>(cuenta.getTransacciones());
                    Collections.reverse(listaInversa);

                    for (Transaccion transaccion : listaInversa) {
                        transaccion.imprimirTransaccion();
                    }
                    break;
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("DNI no válido. Por favor, introduce un DNI válido (8 dígitos seguidos de una letra).");
        }
    }

    private void realizarTransacciones() {

        System.out.println();
        System.out.println("----------------------------");
        System.out.print("Introduce dni o código de cuenta: ");
        String buscador = sc.nextLine();

        Cuenta.validarDNI(buscador);


        for (Cuenta cuenta : cuentas) {
            if (cuenta.getDniResponsable().equals(buscador) || cuenta.getCodigo().equals(buscador)) {

                System.out.println("1. Alta");
                System.out.println("2. Baja");

                System.out.print("Elige una opción: ");
                int opcionTransaccion = sc.nextInt();

                sc.nextLine();

                if (opcionTransaccion < 1 || opcionTransaccion > 2) {
                    System.out.println("Opción no válida");
                    return;
                }



                switch (opcionTransaccion) {
                    case 1:
                        try {
                            System.out.print("Código: ");
                            String codigoProducto = sc.nextLine();
                            System.out.print("Nombre: ");
                            String nombreProducto = sc.nextLine();
                            System.out.print("Precio: ");
                            double precioProducto = sc.nextDouble();

                            Cuenta.validarCodigo(codigoProducto);
                            Cuenta.validarCodigo(nombreProducto);
                            validarPrecio(precioProducto);


                            Producto nuevoProducto = new Producto(codigoProducto, nombreProducto, precioProducto);
                            cuenta.alta(nuevoProducto);
                            System.out.println("Alta de " + nombreProducto + " realizada exitosamente.");
                            System.out.println();
                            break;

                        } catch (IllegalArgumentException e) {
                            System.out.println("Entrada no válida");
                        }


                    case 2:
                        for (Producto prod : cuenta.getProductos()) {
                            System.out.println("\t" + "->" + prod.getCodigo() + " / " + prod.getNombre());
                        }

                        try {
                            System.out.print("Código a dar de baja: ");
                            String codigoAEliminar = sc.nextLine();

                            Cuenta.validarCodigo(codigoAEliminar);

                            cuenta.baja(codigoAEliminar);
                            System.out.println("Baja del producto con código " + codigoAEliminar + " realizada exitosamente.");
                            break;

                        } catch (IllegalArgumentException e) {
                            System.out.println("Entrada no válida");
                        }


                }
            }
        }
    }

    // METODOS AUXILIARES

    static void validarNombreEmpresa(String nombreEmpresa) {
        if (nombreEmpresa == null || nombreEmpresa.isEmpty())
            throw new IllegalArgumentException("El nombre no puede ser nulo ni estar vacío");
    }

    static void validarPrecio(double precio) {
        if (precio < 0)
            throw new IllegalArgumentException("El precio no puede ser negativo");
    }
}
