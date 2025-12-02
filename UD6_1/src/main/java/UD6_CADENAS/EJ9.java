package UD6_CADENAS;

import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.print("Introduce una vocal: ");
        char vocal = sc.next().charAt(0);

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == vocal) {
                frase = frase.replace(vocal, Character.toUpperCase(vocal));
            }
        }
        System.out.println(frase);

    }
}
