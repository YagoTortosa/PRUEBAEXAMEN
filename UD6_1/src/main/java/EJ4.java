import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TAM = 20;
        int [] numeros = new int[TAM];
        int sumaPositivos = 0,  sumaNegativos = 0;

        for (int i = 0; i < TAM; i++) {
            System.out.print("Introduce un numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
            } else  {
                sumaNegativos += numeros[i];
            }
        }

        System.out.println("La suma de positivos es: " + sumaPositivos + " y la suma de negativos es: " + sumaNegativos);

    }
}
