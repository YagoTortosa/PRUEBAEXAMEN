package CONJUNTOS;

import java.util.Collections;
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
            if (!palabras.add(palabra)) { // Como un set no admite duplicados, devuelve TRUE si la palabra no estaba y FALSE si ya estaba.
                palabrasRepetidas.add(palabra); // Si devuelve FALSE se metera en el set de palabras repetidas.
            }
        }

        // Este bucle es para buscar las palabras que aparecen una sola vez
        for (String palabra : palabras) { // Recorre el conjunto "palabras" que ya contiene todas las palabras que se no se repiten
            if (!palabrasRepetidas.contains(palabra)) { // Si la palabra no esta en el set de palabrasRepetidas significa que ha aparecido una unica vez en la frase.
                palabrasNoRepetidas.add(palabra);
            }
        }


        /*for (String palabra : palabras) {
            int veces = Collections.frequency(palabras, palabra);
            if (veces > 1) {
                palabrasRepetidas.add(palabra);
            } else {
                palabrasNoRepetidas.add(palabra);
            }
        }*/

        System.out.print("Palabras repetidas: " + palabrasRepetidas);
        System.out.print("\nPalabras no repetidas: " + palabrasNoRepetidas);


    }
}
// Tengo TartamudEZ y REPITO repito mucho MucHO todas las LAS palabras
