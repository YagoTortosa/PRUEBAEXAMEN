import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce precio del artículo: ");
        double precio = sc.nextDouble();
        System.out.print("Introduce precio del artículo rebajado: ");
        double rebajado = sc.nextDouble();

        double descuento = ((precio - rebajado) / precio) * 100;

        DecimalFormat df = new DecimalFormat("####.##");
        System.out.println("El descuento es: " + df.format(descuento) + "%");
    }
}
