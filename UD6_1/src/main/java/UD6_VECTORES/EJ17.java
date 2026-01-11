package UD6_VECTORES;

import java.util.Arrays;
import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TAM = 10;

        int[] primeraParte = new int[TAM];
        int[] segundaParte = new int[TAM];

        System.out.println("Primera parte: ");
        for (int i = 0; i < primeraParte.length; i++) {
            System.out.print("Introduce numero " + (i + 1) + ": ");
            int numero = sc.nextInt();
            primeraParte[i] = numero;
        }

        System.out.println("\nSegunda parte: ");
        for (int i = 0; i < segundaParte.length; i++) {
            System.out.print("Introduce numero " + (i + 1) + ": ");
            int numero = sc.nextInt();
            segundaParte[i] = numero;
        }

        if (Arrays.equals(primeraParte, segundaParte)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        System.out.println(Arrays.toString(primeraParte));
        System.out.println(Arrays.toString(segundaParte));









    }
}
