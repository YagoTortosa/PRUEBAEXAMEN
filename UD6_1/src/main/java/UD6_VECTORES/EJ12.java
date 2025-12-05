package UD6_VECTORES;

import java.util.Arrays;
import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int []array = new int[10];

        System.out.print("a. Mostrar valores.\nb. Introducir valor\nc. Salir\n");
        System.out.print("Introduce una opción: ");
        char opcion  = input.next().charAt(0);


        while (opcion != 'c') {
            switch (opcion) {
                case 'a':
                    System.out.print("Estos son los valores del array: " + Arrays.toString(array));
                    break;
                case 'b':
                    System.out.print("Introduce un valor: ");
                    int valor = input.nextInt();
                    System.out.print("Introduce una posicion: ");
                    int posicion = input.nextInt();
                    array[posicion] = valor;
                    break;
            }
        }

        System.out.println("Fin del programa.");
    }
}
