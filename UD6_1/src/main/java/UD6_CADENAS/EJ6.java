package UD6_CADENAS;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        StringBuilder fraseInvertida = new StringBuilder(frase);

        fraseInvertida.reverse();

        System.out.print("Frase invertida: " + fraseInvertida);
    }
}
