import java.util.Arrays;
import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TAM = 10;
        final int numeros[] = new int[TAM];

        for(int i = 0 ; i < numeros.length; i++) {
            System.out.print("Introduce 10 numeros reales: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Los numeros reales son: " + Arrays.toString(numeros));



    }
}
