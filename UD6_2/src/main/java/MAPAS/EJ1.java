package MAPAS;

import java.util.HashMap;
import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> numeroApariciones = new HashMap<>();

        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();

        int numeroVeces = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char character = cadena.charAt(i);
            if (numeroApariciones.containsKey(character)) { // Si el caracter esta en el mapa...
                numeroVeces = numeroApariciones.get(character); // ...obtenemos el numero de veces que ha aparecido...
                numeroApariciones.put(character, numeroVeces + 1); // ...y lo actualizamos sumandole 1.
            } else {
                numeroApariciones.put(character, 1); // Si no esta en el mapa, lo añadimos con valor 1.
            }
        }
        System.out.println("Frecuencia de caracteres: ");
        System.out.println(numeroApariciones);
    }
}
// Cuenta hasta tres