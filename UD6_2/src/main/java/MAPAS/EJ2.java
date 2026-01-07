package MAPAS;

import java.util.*;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase;

        do {

            System.out.print("Introduce una frase: ");
            // la palabra que más aparece en este texto es la palabra palabra
            frase = sc.nextLine();

        } while (frase.isEmpty());

        String[] fraseDividida = frase.split(" ");

        HashMap<String, List<Integer>> mapaDePalabras = new LinkedHashMap<>();
        int posicion = 0;

        for (int i = 0; i < fraseDividida.length; i++) {
            posicion++;
            String palabra = fraseDividida[i];

            // Si la palabra no existe, creamos la lista
            if (!mapaDePalabras.containsKey(palabra)) {
                mapaDePalabras.put(palabra, new ArrayList<>());
            }

            // Añadimos la posición
            mapaDePalabras.get(palabra).add(posicion);
        }

        System.out.println("Posiciones de las palabras:");

        for (Map.Entry<String, List<Integer>> entry : mapaDePalabras.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}

