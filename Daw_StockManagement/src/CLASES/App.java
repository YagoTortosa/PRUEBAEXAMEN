import java.util.Scanner;
import java.util.Set;

public class App {
    private String nombreEmpresa;
    private Set<Cuenta> cuentas;

    private Scanner sc = new Scanner(System.in);

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
        int intentos = 0;


        do {

            System.out.println("Introduce tu usuario:");
            String usuario = sc.nextLine();
            System.out.println("Introduce tu contraseña:");
            String contrasenya = sc.nextLine();

            if (usuario.equals(superUsuario) && contrasenya.equals(superContrasenya)) {
                System.out.println("¡Bienvenido, superusuario!");
                return true;
            } else {
                System.out.println("Credenciales incorrectas. Inténtalo de nuevo.");
                intentos++;
            }


        } while (intentos < 3);

        System.out.println("Has superado el número máximo de intentos. Acceso denegado.");
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

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 5.");
            }
        }
    }

    private void crearCuenta() {

    }



}
