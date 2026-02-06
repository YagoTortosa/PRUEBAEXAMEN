package FUNCIONES;

import java.util.Arrays;
import java.util.Scanner;

public class FuncionCinco {
    public static int resultadoDivision(int[] vector) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce primera posición: ");
        int posicionUno = sc.nextInt();

        System.out.print("Introduce segunda posición: ");
        int posicionDos = sc.nextInt();




       return vector[posicionUno] * vector[posicionDos];
    }





    public static int[] vectorRellenado() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño del array: ");
        int numero = sc.nextInt();

        int[] vector = new int[numero];

        for (int i = 0; i < vector.length; i++) {
            int aleatorio = (int) (Math.random() * 50);
            vector[i] = aleatorio;
        }

        System.out.println("---Array---");
        System.out.print(Arrays.toString(vector));

        return vector;
    }
}
