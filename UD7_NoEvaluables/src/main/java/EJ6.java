import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce precio 1: ");
        double precio1 = sc.nextDouble();
        System.out.print("Introduce precio 2: ");
        double precio2 = sc.nextDouble();
        System.out.print("Introduce precio 3: ");
        double precio3 = sc.nextDouble();
        System.out.print("Introduce precio 4: ");
        double precio4 = sc.nextDouble();
        System.out.print("Introduce precio 5: ");
        double precio5 = sc.nextDouble();


        System.out.println("El precio de venta de " + precio1 + " es " + precioConIVA(precio1));
        System.out.println("El precio de venta de " + precio2 + " es " + precioConIVA(precio2));
        System.out.println("El precio de venta de " + precio3 + " es " + precioConIVA(precio3));
        System.out.println("El precio de venta de " + precio4 + " es " + precioConIVA(precio4));
        System.out.println("El precio de venta de " + precio5 + " es " + precioConIVA(precio5));



    }

    public static double precioConIVA(double precio) {
        final double IVA = 0.21;
        precio = precio * IVA;
        return precio;
    }
}
