package UD6_MATRICES;

import java.util.Arrays;
import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {


        final int TAM = 5;
        int[][] matriz = new int[TAM][TAM];

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz.length; j++) {}
            matriz[i][i] = i;
        }

        System.out.println(Arrays.deepToString(matriz));

    }
}
