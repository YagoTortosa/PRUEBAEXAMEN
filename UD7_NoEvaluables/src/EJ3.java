import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int num2 = sc.nextInt();

        System.out.println("El número mínimo es: " + minimo(num1, num2));


    }

    public static int minimo(int a, int b) {
        return Math.min(a, b);
    }
}
