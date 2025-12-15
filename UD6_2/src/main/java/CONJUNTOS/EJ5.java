package CONJUNTOS;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        LinkedHashSet<String> nombres = new LinkedHashSet<>();

        do {
            System.out.println("Introduce nombres (escribe 'fin' para terminar): ");
            nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            if (nombre.isEmpty()) {
                System.out.println("Nombre inválido: no puede estar vacío.");
            } else if (!nombre.matches("[a-zA-Z]+")) {
                System.out.println("Nombre inválido: solo se permiten letras.");
            } else {
                nombres.add(nombre);
            }

        } while (true);

        System.out.println("Conjunto de nombres no ordenados: " + nombres);




    }
}
