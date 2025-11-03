import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int num = sc.nextInt();

        int suma = num * (num + 1) / 2;

        System.out.println("La suma de los primeros números enteros desde 1 hasta " + num + " es " + suma);
    }
}
