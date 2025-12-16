package CONJUNTOS;

import java.util.ArrayList;
import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        String [] fraseArray = frase.split(" ");

        ArrayList<String> palabras = new ArrayList<>();
        ArrayList<String> palabrasRepetidas = new ArrayList<>();
        ArrayList<String> palabrasNoRepetidas = new ArrayList<>();

        // UTILIZAR FOR-EACH

        for (String palabra : fraseArray) {
            if (!palabras.contains(palabra)) {
                palabras.add(palabra);
                palabrasNoRepetidas.add(palabra);
            } else {
                if (!palabrasRepetidas.contains(palabra)) {
                    palabrasRepetidas.add(palabra);
                }
                palabrasNoRepetidas.remove(palabra);
            }
        }



    }
}
