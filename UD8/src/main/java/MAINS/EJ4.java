package MAINS;

import java.util.Scanner;

import static FUNCIONES.FuncionCuatro.convertirImprimirVector;
import static FUNCIONES.FuncionCuatro.rellenarVector;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tamaño del vector: ");
        int tam = sc.nextInt();

        sc.nextLine();

        if (tam < 0) {
            System.out.println("Error: El tamaño del vector no puede ser negativo.");

        } else {

            convertirImprimirVector(rellenarVector(tam));

        }







    }
}
