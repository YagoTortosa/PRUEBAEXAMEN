package UD6_CADENAS;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce el precio del producto: ");
        double precio = sc.nextDouble();

        int numeroEntero = (int) precio;

        System.out.print("Euros: " + numeroEntero);


    }
}
