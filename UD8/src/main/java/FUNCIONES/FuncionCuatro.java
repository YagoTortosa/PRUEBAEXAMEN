package FUNCIONES;

import java.util.Scanner;

public class FuncionCuatro {
    public static int rellenarVector(int tam) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[tam];

        for (int i = 0; i < tam; i++) {
            System.out.println("Introduce el valor para la posición " + i + ": ");
            vector[i] = sc.nextInt();




        }

        return tam;
    }
}
