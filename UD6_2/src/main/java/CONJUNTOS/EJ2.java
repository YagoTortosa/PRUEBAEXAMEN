package CONJUNTOS;

import java.util.*;

public class EJ2 {
    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Integer> conjuntoOriginal = new ArrayList<>(10);


        for (int i = 0; i <= 10; i++) {
            int aleatorio = random.nextInt(101);
            conjuntoOriginal.add(aleatorio);
        }

        ArrayList<Integer> conjuntoOrdenado = new ArrayList<>(conjuntoOriginal);

        Collections.sort(conjuntoOrdenado, Collections.reverseOrder());

        System.out.println("Conjunto original: " + conjuntoOriginal);
        System.out.println("Conjunto ordenado (creciente):  " + conjuntoOrdenado);


    }
}
