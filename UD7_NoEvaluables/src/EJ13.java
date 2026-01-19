import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el precio original del producto: ");
        double precio = input.nextDouble();

        System.out.print("Introduce el porcentaje de descuento a aplicar: ");
        double porcentaje = input.nextDouble();

        calculoDescuento(precio, porcentaje);




    }
    public static void calculoDescuento(double precioOriginal, double porcentajeDescuento) {
        double descuento = (porcentajeDescuento / 100) * precioOriginal;
        double precioFinal = precioOriginal - descuento;
        System.out.println("El precio final después de un descuento del " + porcentajeDescuento + "% es: " + precioFinal);
    }


}
