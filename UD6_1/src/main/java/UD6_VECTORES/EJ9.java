package UD6_VECTORES;

import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TAM = 100;
        int[] array = new int[TAM];

        System.out.print("Introduce valor N: ");
        int n = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + (int) (Math.random() * 10);

            if (array[i] == n) {
                System.out.println("Valor " + n + " aparece en estas posiciones: " + i);
            }
        }

    }
}
