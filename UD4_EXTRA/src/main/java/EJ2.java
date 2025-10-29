
import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio del primer producto: ");
        double primerPrecio = sc.nextDouble();
        System.out.print("Introduce el precio del segundo producto: ");
        double segundoPrecio = sc.nextDouble();

        double precioMasCaro = Math.max(primerPrecio, segundoPrecio);
        double precioMasBarato = Math.min(primerPrecio, segundoPrecio);
        double diferencia = precioMasBarato - precioMasCaro;

        System.out.printf("Producto más caro: %.2f $", precioMasCaro);
        System.out.printf("\nProducto más barato: %.2f $", precioMasBarato);
        System.out.printf("\nDiferencia: %.2f $", diferencia);
    }
}
