
import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero con decimales: ");
        double num1 = sc.nextDouble();
        int num1Entero = (int) num1;

        if (num1Entero % 2 == 0) {
            System.out.println("El numero " + num1Entero + " es par");
        } else {
            System.out.println("El numero " + num1Entero + " es impar");
        }


        System.out.print("Introduce un numero con decimales: ");
        double num2 = sc.nextDouble();
        int num2Entero = (int) num2;

        if (num2Entero % 2 == 0) {
            System.out.println("El numero " + num2Entero + " es par");
        } else {
            System.out.println("El numero " + num2Entero + " es impar");
        }

    }
}
