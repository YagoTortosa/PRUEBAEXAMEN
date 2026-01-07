package MAPAS;

import java.util.HashMap;
import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        HashMap<String, Integer> nombresUsuario = new HashMap<>();
        nombresUsuario.put("admin", 123);
        nombresUsuario.put("user", 1954);

        int intentos = 3;

        String usuario;
        int contrasena;

        do {
            System.out.println("Por favor, introduce nombre de usuario y contrasena para acceder al área restringida (3 intentos)");
            System.out.print("Usuario: ");
            usuario = sc.nextLine();
            System.out.print("Contrasena: ");
            contrasena = sc.nextInt();

            sc.nextLine();

            nombresUsuario.put(usuario, contrasena);

            if (nombresUsuario.containsKey(usuario) && nombresUsuario.containsValue(contrasena)) {
                System.out.println("Ha accedido al área restringida");
            } else {
                intentos--;

            }


        } while (intentos != 0);

    }
}
