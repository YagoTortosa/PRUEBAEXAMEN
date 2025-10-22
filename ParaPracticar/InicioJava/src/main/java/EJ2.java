import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el precio del producto:  ");
        double precio = sc.nextDouble();

        final double iva = 1.21;
        double precioConIVA = precio * iva;

        System.out.println("El precio del producto con IVA es:  " +  precioConIVA);






    }
}
