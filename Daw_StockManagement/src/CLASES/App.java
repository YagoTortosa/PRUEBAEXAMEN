import java.util.*;



public class App {
    private String nombreEmpresa;
    private Set<Cuenta> cuentas;

    private final Scanner sc = new Scanner(System.in);

    static final String superUsuario = "admin";
    static final String superContrasenya = "123";

    public App(String nombreEmpresa, Set<Cuenta> cuentas) {
        if (nombreEmpresa == null || nombreEmpresa.isEmpty())
            throw new IllegalArgumentException("El nombre de la empresa no puede ser nulo o vacío.");
        if (cuentas == null || cuentas.isEmpty())
            System.out.println("La empresa no tiene cuentas registradas.");

        this.nombreEmpresa = nombreEmpresa;
        this.cuentas = cuentas;
    }


    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
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
        Scanner sc = new Scanner(System.in);
        int intentos = 3;


        do {
            System.out.println("Acceso a DAW Stock Management");
            System.out.println("==============================");

            System.out.println("Introduce tu usuario:");
            String usuario = sc.nextLine();
            System.out.println("Introduce tu contraseña:");
            String contrasenya = sc.nextLine();

            if (usuario.equals(superUsuario) && contrasenya.equals(superContrasenya)) {
                System.out.println("** Bienvenido a DAW Stock Management **");
                return true;
            } else {
                System.out.println("User o pass incorrectos, quedan " + intentos + " intentos.");
                intentos--;
            }


        } while (intentos > 0);

        System.out.println("Has agotado el número de intentos.");
        System.out.println("Saliendo del sistema ...");
        return false;
    }



    public void menu() {
        int opcion;

        do {
            System.out.println("--- Menú Principal ---");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Consultar cuenta");
            System.out.println("3. Consultar transacciones");
            System.out.println("4. Realizar transacciones");
            System.out.println("5. Salir");

            System.out.println("Selecciona una opción:");
            opcion = sc.nextInt();

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
        System.out.print("Introduce dni del responsable del departamento: ");
        Cuenta.validarDNI(sc.nextLine());

        for (Cuenta cuenta : cuentas) {

            if (cuenta.getDniResponsable().equals(dniResponsable)) {
                System.out.println("Ya existe una cuenta asociada a este DNI.");
                break;

            } else {

                try {
                    System.out.print("Introduce el departamento al que pertenece la cuenta:");
                    Departamento dpto = Departamento.valueOf(sc.nextLine());

                    Cuenta nuevaCuenta = new Cuenta(dniResponsable, dpto);
                    cuentas.add(nuevaCuenta);
                    System.out.println("Cuenta creada exitosamente");
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Departamento no válido. Por favor, introduce un departamento válido (MARKETING, DIRECCION, INFORMATICA, RRHH).");
                }
            }
        }
    }

    private void consultarCuenta() {
        System.out.print("Introduce dni o código de cuenta: ");
        String buscador = sc.nextLine();

        if (buscador.isEmpty()) {
            System.out.println("El campo de búsqueda no puede estar vacío.");
        } else {
            for (Cuenta cuenta : cuentas) {
                if (cuenta.getDniResponsable().equals(buscador) || cuenta.getCodigo().equals(buscador)) {
                    System.out.println("Cuenta encontrada:");
                    cuenta.imprimirDatosCuenta();
                    cuenta.imprimirProductos();
                    break;
                } else {
                    System.out.println("No se encontró ninguna cuenta con ese DNI o código .");

                }
            }
        }
    }

    private void consultarTransacciones() {
        System.out.print("Introduce dni o código de cuenta: ");
        String buscador = sc.nextLine();

        if (buscador.isEmpty()) {
            System.out.println("El campo de búsqueda no puede estar vacío.");
        } else {
            for (Cuenta cuenta : cuentas) {
                if (cuenta.getDniResponsable().equals(buscador) || cuenta.getCodigo().equals(buscador)) {
                    System.out.println("Transacciones asociadas a la cuenta " + cuenta.getCodigo() + ":");
                    for (Transaccion transaccion : cuenta.getTransacciones()) {
                        transaccion.imprimirTransaccion();
                    }
                    break;
                } else {
                    System.out.println("No se encontró ninguna cuenta con ese DNI o código .");

                }
            }
        }

    }

    private void realizarTransacciones() {
        System.out.print("Introduce dni o código de cuenta: ");
        String buscador = sc.nextLine();

        if (buscador.isEmpty()) {
            System.out.println("El campo de búsqueda no puede estar vacío.");
        } else {
            for (Cuenta cuenta : cuentas) {
                if (cuenta.getDniResponsable().equals(buscador) || cuenta.getCodigo().equals(buscador)) {

                    System.out.println("1. Alta");
                    System.out.println("2. Baja");

                    int opcionTransaccion = sc.nextInt();

                    if (opcionTransaccion < 1 || opcionTransaccion > 2) {
                        System.out.println("Opción no válida");
                        return;
                    }



                    switch (opcionTransaccion) {
                        case 1:
                            System.out.print("Código: ");
                            String codigoProducto = sc.nextLine();
                            System.out.print("Nombre: ");
                            String nombreProducto = sc.nextLine();
                            System.out.print("Precio: ");
                            double precioProducto = sc.nextDouble();

                            if (codigoProducto.isEmpty() || nombreProducto.isEmpty() || precioProducto <= 0) {
                                System.out.println("Datos no válidos del producto.");
                            } else {
                                Producto nuevoProducto = new Producto(codigoProducto, nombreProducto, precioProducto);
                                cuenta.alta(nuevoProducto);
                                System.out.println("Alta de " + nombreProducto + " realizada exitosamente.");
                            }
                            break;

                        case 2:
                            for (Producto prod : cuenta.getProductos()) {
                                System.out.println("-> " + prod.getNombre() + " (Código: " + prod.getCodigo());
                            }

                            System.out.print("Introduce el código del producto a eliminar: ");
                            String codigoAEliminar = sc.nextLine();

                            if (codigoAEliminar.isEmpty()) {
                                System.out.println("El código del producto no puede estar vacío.");
                            } else {
                                cuenta.baja(codigoAEliminar);
                                System.out.println("Baja del producto con código " + codigoAEliminar + " realizada exitosamente.");
                            }
                            break;

                    }

                }


            }
        }

    }




}
