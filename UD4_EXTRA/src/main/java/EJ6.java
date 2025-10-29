import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.print("Introduce el precio del producto: ");
        double precio = sc.nextDouble();

        double iva = precio * 0.21;
        double precioFinal = precio + iva;


        System.out.printf("Base imponible: %s $%n", df.format(precio));
        System.out.printf("IVA: %s $%n", df.format(iva));
        System.out.printf("Precio final: %s $%n", df.format(precioFinal));
    }
}
