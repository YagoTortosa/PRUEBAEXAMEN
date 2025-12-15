package CONJUNTOS;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class EJ4 {
    public static void main(String[] args) {
        Random random = new Random();

        HashSet<Integer> conjuntoOriginal = new HashSet<>(10);

        for (int i = 0; i <= 10; i++) {
            int aleatorio = random.nextInt(50);
            conjuntoOriginal.add(aleatorio);
        }

        Integer max = Collections.max(conjuntoOriginal);
        Integer min = Collections.min(conjuntoOriginal);

        System.out.println("Conjunto HashSet con numeros aleatorios: " + conjuntoOriginal);
        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);


    }
}
