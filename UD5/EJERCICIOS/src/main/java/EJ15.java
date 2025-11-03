import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el importe del pedido: ");
        double importe = sc.nextDouble();

        final double descuento = 0.1;
        final int recargoPorEnvio = 5;

        if (importe > 100) {
            importe = importe - (importe * descuento);
            System.out.println("Al precio del pedido se le ha anadido el descuento " + importe + " $");
        } else if (importe < 50) {
            importe = importe + recargoPorEnvio;
            System.out.println("Al importe del pedido se le ha aplicado un recargo por envio " + importe + " $");
        } else {
            System.out.println("No se aplica ni descuento ni recargo por envio " + importe + " $");
        }
    }
}
