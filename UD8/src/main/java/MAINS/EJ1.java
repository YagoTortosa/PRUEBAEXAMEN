package MAINS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);

        int valor;
        int error = 0;

        do {
            try {
                System.out.print("Introduce un numero: ");
                valor = sc.nextInt();



                if (valor < 0) {
                    error++;
                    System.out.println("Valor introducido incorrecto. Intentos restantes: " + (3 - error));
                } else {
                    System.out.println("El numero introducido es: " + valor);
                    break;
                }
            } catch (InputMismatchException e) {
                error++;
                sc.nextLine();
                System.out.println("No se permiten números negativos u letras. Intentos restantes: " + (3 - error));
            }

        } while (error != 3);


    }
}
