package UD6_CADENAS;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera frase: ");
        String fraseUno = sc.nextLine();
        System.out.print("Introduce la segunda frase: ");
        String fraseDos = sc.nextLine();


        if (fraseUno.equalsIgnoreCase(fraseDos)) {
            System.out.println("Son iguales");
        }  else {
            System.out.println("No son iguales");
        }

    }
}
