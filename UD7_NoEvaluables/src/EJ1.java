import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplica(num1, num2));



    }

    public static Double multiplica(double a, double b) {
        return a * b;
    }
}
