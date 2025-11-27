import java.util.Arrays;
import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TAM = 3;
        final int numeros[] = new int [TAM];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        System.out.println("La suma de los 10 numeros introducidos es: " + suma);
    }
}
