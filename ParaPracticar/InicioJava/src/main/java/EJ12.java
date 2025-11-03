import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Introduce precio original del artículo: ");
        double precioOriginal = sc.nextDouble();
        System.out.print("Introduce precio del artículo rebajado: ");
        double precioRebajado = sc.nextDouble();

        double descuento = ((precioOriginal - precioRebajado) / precioOriginal) * 100;

        System.out.println("Descuento: " + df.format(descuento));
    }
}
