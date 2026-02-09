package MAINS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce valor A: ");
            int a = sc.nextInt();

            System.out.print("Introduce valor B: ");
            int b = sc.nextInt();

            int division = a / b;

            System.out.println("El resultado es: " + division);

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.out.println("No se permiten letras.");
        }


    }
}
