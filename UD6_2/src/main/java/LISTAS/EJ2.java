package LISTAS;

import java.util.ArrayList;
import java.util.List;

public class EJ2 {
    public static void main(String[] args) {


        // Tamaño aleatorio entre 10 y 20
        final int tamano, rangoIni, rangoFin;
        rangoIni = 10;
        rangoFin = 20;
        tamano = (int) (Math.random() * (rangoFin - rangoIni + 1)) + rangoIni;


        List<Integer> lista = new ArrayList<>();

        int suma = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < tamano; i++) {
            int numero = (int) (Math.random() * 101); // 0 a 100
            lista.add(numero);

            suma += numero;

            min = Math.min(min, numero);
            max = Math.max(max, numero);
        }

        int media = suma / tamano;

        System.out.println("Lista generada: " + lista);
        System.out.println("La suma total es: " + suma);
        System.out.println("La media es: " + media);
        System.out.println("El mínimo es: " + min);
        System.out.println("El máximo es: " + max);





    }
}
