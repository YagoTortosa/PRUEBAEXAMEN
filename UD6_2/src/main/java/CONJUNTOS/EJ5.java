package CONJUNTOS;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        Set<String> nombres = new LinkedHashSet<>();

        System.out.println("Introduce nombres (escribe 'fin' para terminar): ");

        do {

            nombre = sc.nextLine();


            if (nombre.isEmpty()) {
                System.out.println("Nombre inválido: no puede estar vacío.");
            } else if (!nombre.matches("[a-zA-Z]+")) {
                System.out.println("Nombre inválido: solo se permiten letras.");
            } else {
                nombres.add(nombre);
            }

        } while (!nombre.equalsIgnoreCase("fin"));

        System.out.println("Conjunto de nombres no ordenados: " + nombres);




    }
}
