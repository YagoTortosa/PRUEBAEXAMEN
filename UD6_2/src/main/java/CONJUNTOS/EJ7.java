package CONJUNTOS;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase;

        do {
            System.out.print("Introduce una frase: ");
            frase = sc.nextLine();

        } while (frase.isEmpty());


        String [] fraseArray = frase.split(" ");

        Set<String> palabras = new TreeSet<>();
        Set<String> palabrasRepetidas = new TreeSet<>();
        Set<String> palabrasNoRepetidas = new TreeSet<>();

        for (String palabra : fraseArray) {
            palabra = palabra.toLowerCase();
            if (!palabras.add(palabra)) {
                palabrasRepetidas.add(palabra);
            }
        }

        for (String palabra : palabras) {
            if (!palabrasRepetidas.contains(palabra)) {
                palabrasNoRepetidas.add(palabra);
            }
        }

        System.out.print("Palabras repetidas: " + palabrasRepetidas);
        System.out.print("\nPalabras no repetidas: " + palabrasNoRepetidas);


    }
}

// Tengo TartamudEZ y REPITO repito mucho MucHO todas las LAS palabras
