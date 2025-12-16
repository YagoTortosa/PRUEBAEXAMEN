package UD6_VECTORES;

import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TAM = 10;
        int cantidad = 0;
        for (int i = 1; i <= TAM; i++) {
            cantidad += i;
        }

        int []array = new int [cantidad];
        int indice = 0;

        for (int i = 1; i <= TAM; i++) {
            for (int j = 0; j < i; j++) {
                array[indice] = i;
                indice++;
            }
        }

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + ", ");
        }
    }
}