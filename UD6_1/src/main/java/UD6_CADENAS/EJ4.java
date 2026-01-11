package UD6_CADENAS;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        String fraseConvertida = frase.toLowerCase();


        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;


        for (int j = 0; j < fraseConvertida.length(); j++) {
            if (fraseConvertida.charAt(j) == 'a') {
                a++;
            } else if (fraseConvertida.charAt(j) == 'e') {
                e++;
            } else if (fraseConvertida.charAt(j) == 'i') {
                i++;
            } else if (fraseConvertida.charAt(j) == 'o') {
                o++;
            } else if (fraseConvertida.charAt(j) == 'u') {
                u++;
            }
        }

        System.out.println("El numero de 'a' es: " + a);
        System.out.println("El numero de 'e' es: " + e);
        System.out.println("El numero de 'i' es: " + i);
        System.out.println("El numero de 'o' es: " + o);
        System.out.println("El numero de 'u' es: " + u);


    }
}
