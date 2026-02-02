package EJERCICIOS;

import java.util.Scanner;

import static FUNCIONES.FuncionTres.imprimeNegativo;
import static FUNCIONES.FuncionTres.imprimePositivo;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();

        try {
            imprimePositivo(numero);
            imprimeNegativo(numero);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }



    }
}
