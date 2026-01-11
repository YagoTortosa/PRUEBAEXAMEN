package UD6_CADENAS;

import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce los productos de la cesta separados por comas: ");
        String productos = sc.nextLine();

        String[] productosSeparados = productos.split(",");

        for (int i = 0; i < productosSeparados.length; i++) {
            System.out.println(productosSeparados[i]);
        }
    }
}
