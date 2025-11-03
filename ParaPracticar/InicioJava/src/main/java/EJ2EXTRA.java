import java.util.Scanner;

public class EJ2EXTRA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio del primer producto: ");
        double precio1 = sc.nextDouble();
        System.out.print("Introduce el precio del segundo producto: ");
        double precio2 = sc.nextDouble();

        System.out.printf("Producto mas caro: %.2f $%n", Math.max(precio1, precio2));
        System.out.printf("Producto mas barato: %.2f $%n", Math.min(precio1, precio2));
        System.out.printf("Diferencia: %.2f $", Math.abs(precio1 - precio2));
    }
}
