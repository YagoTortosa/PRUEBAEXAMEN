
import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        double numeroDecimal = sc.nextDouble();

        int numeroEntero = (int) numeroDecimal;
        double parteDecimal = numeroDecimal - numeroEntero;


        System.out.printf("Parte entera: %d%n", numeroEntero);
        System.out.printf("Parte decimal: %.3f%n", parteDecimal);



    }
}
