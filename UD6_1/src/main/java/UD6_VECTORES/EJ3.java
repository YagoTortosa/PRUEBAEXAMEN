package UD6_VECTORES;

import java.util.Arrays;
import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TAM = 10;
        int [] numeros = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("El numero minimo es: " + numeros[0] + " y el numero maximo es: " + numeros[numeros.length - 1]);
    }
}
