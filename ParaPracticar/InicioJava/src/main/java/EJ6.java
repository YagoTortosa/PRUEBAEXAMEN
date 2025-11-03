
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce un numero decimal: ");
        double num = sc.nextDouble();

        int numeroParteEntera = (int) num;
        double parteDecimal = Math.abs(num - numeroParteEntera);


        System.out.printf("Parte entera: %d%n", numeroParteEntera);
        System.out.printf("Parte decimal: %.3f", parteDecimal);


    }
}
