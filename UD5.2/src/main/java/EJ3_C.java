import java.util.Scanner;

public class EJ3_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String usuarioClave = "Yago";
        final String contrasenaClave = "123456";
        int intentos = 0;

        while (intentos < 3) {
            System.out.print("Introduzca el usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Introduzca la contraseña: ");
            String contrasena = sc.nextLine();

            if (usuario.equals(usuarioClave) && contrasena.equals(contrasenaClave)) {
                System.out.println("Bienvenidos al sistema");
                return;     // Finaliza el programa
            }

            System.out.println("Datos incorrectos, vuelva a intentarlo");
            intentos++;
        }

        System.out.println("Superado el número de intentos permitidos.");
    }
}
