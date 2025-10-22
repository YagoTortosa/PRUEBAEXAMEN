import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        int suma = numero * (numero + 1) / 2;

        System.out.print("La suma de los primeros números enteros desde 1 hasta " + numero +  " es " + suma);
    }
}
