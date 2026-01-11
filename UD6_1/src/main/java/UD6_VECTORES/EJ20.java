package UD6_VECTORES;

import java.util.Arrays;
import java.util.Scanner;

public class EJ20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TAM = 1000;

        int[] array = new int [TAM];

        int contador = 0;
        boolean existe = false;

        System.out.print("Introduce valor N: ");
        int valor = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            int aleatorio = (int) (Math.random() * 100);
            array[i] = aleatorio;

            if (valor == array[i]) {
                existe = true;
                contador++;
            }
        }


        System.out.println(Arrays.toString(array));

        if (existe) {
            System.out.println("Si existe dentro del array.");
        } else {
            System.out.println("No existe dentro del array.");
        }

        System.out.println("Aparece " + contador + " veces.");


    }
}
