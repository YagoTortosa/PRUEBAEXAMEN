package CONJUNTOS;

import java.util.*;

public class EJ3 {
    public static void main(String[] args) {


        Random aleatorio = new Random();

        final int TAM = 10;
        final int rango = 20;

        Set<Integer> listaMenorAMayor = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i <= TAM; i++) {
            int random = aleatorio.nextInt(rango);
            listaMenorAMayor.add(random);
        }


        System.out.println("Conjunto ordenado (decreciente y no repetidos): " + listaMenorAMayor);







    }
}
