package MAPAS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Map<String, Integer> nombresUsuario = new HashMap<>();
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

            if (nombresUsuario.get(usuario) == contrasena) { // Si el usuario introducido coincide con el que esta dentro del mapa devuelve su valor asociado (CONTRASEÑA = VALUE) y ya compara la contraseña introducida por teclado con el valor.
                System.out.println("Has accedido al área restringida.");
                break;
            } else {
                intentos--;
                if (intentos == 0) {
                    System.out.println("Lo siento, no tiene acceso al área restringida.");
                } else {
                    System.out.println("Quedan " + intentos + " oportunidades.");
                }
            }


        } while (intentos > 0);

    }
}
