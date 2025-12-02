package UD6_CADENAS;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();

        String []cadenaDivida = cadena.split(" ");

        for (int i = 0; i < cadenaDivida.length; i++) {
            System.out.println(cadenaDivida[i]);
        }

    }
}
