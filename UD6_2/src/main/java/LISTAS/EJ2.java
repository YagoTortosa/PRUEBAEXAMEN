package LISTAS;

import java.util.ArrayList;
import java.util.Arrays;

public class EJ2 {
    public static void main(String[] args) {


        final int numeroInicial = 0;
        final int numeroFinal = 100;

        final int numeroArrayInicial = 10;
        final int numeroArrayFinal = 20;

        ArrayList<Integer> listaAleatorios = new ArrayList<>();

        int suma = 0;
        int minima = Integer.MAX_VALUE;
        int maxima = Integer.MIN_VALUE;

        int rangoNumeros = (int) (Math.random() * (numeroArrayFinal - numeroArrayInicial + 1)) + numeroArrayInicial;

        for (int i = 0; i < rangoNumeros; i++) {

            int numeroAleatorio = (int) (Math.random() * (numeroFinal - numeroInicial + 1)) + numeroInicial;
            listaAleatorios.add(numeroAleatorio);
            suma += numeroAleatorio;
            minima = Math.min(minima, numeroAleatorio);
            maxima = Math.max(maxima, numeroAleatorio);

        }

        int media = suma / listaAleatorios.size();

        System.out.println("Lista generada: " + Arrays.toString(listaAleatorios.toArray()));
        System.out.println("La suma total es: " + suma);
        System.out.println("La media es: " + media);
        System.out.println("El minima: " + minima);
        System.out.println("El maxima: " + maxima);









    }
}
