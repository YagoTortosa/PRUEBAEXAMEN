import java.util.Arrays;
import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TAM = 10;
        double []array = new double[TAM];
        int contNumerosReales = 0;

        System.out.print("Introduce valor real R: ");
        double numReal =  sc.nextDouble();

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();

            if (array[i] >= numReal) {
                contNumerosReales++;
            }
        }
        System.out.println("Numeros reales iguales o superiores a R: " + contNumerosReales);
        System.out.println(Arrays.toString(array));
    }
}
