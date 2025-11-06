import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String clave = "thebest";

        System.out.print("Introduce la contrasena: ");
        String contrasena = sc.nextLine();

        if (contrasena.equalsIgnoreCase(clave)) {
            System.out.println("La contraseña coincide");
        } else {
            System.out.println("La contraseña no coincide");
        }

    }
}
