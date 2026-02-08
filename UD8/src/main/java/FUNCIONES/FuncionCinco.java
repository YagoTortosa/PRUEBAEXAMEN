package FUNCIONES;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FuncionCinco {
    public static int resultadoDivision(int[] vector) {
        Scanner sc = new Scanner(System.in);


        int division = 0;
        try {
            System.out.print("\nIntroduce primera posición: ");
            int posicionUno = sc.nextInt();

            System.out.print("Introduce segunda posición: ");
            int posicionDos = sc.nextInt();

            int valorUno = vector[posicionUno];
            int valorDos = vector[posicionDos];

            division = posicionUno / posicionDos;

        } catch (InputMismatchException e) {
            System.out.println("El dato introducido debe ser un número entero.");
            return division;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
            return division;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Las posiciones introducidas no son válidas para el array.");
            return division;
        }

        return division;
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
