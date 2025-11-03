import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Producto 1 (nombre): ");
        String nombre1 = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad1 = sc.nextInt();
        System.out.print("Precio Unitario ($): ");
        double precio1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Producto 2 (nombre): ");
        String nombre2 = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad2 = sc.nextInt();
        System.out.print("Precio Unitario ($): ");
        double precio2 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Producto 3 (nombre): ");
        String nombre3 = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad3 = sc.nextInt();
        System.out.print("Precio Unitario ($): ");
        double precio3 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Producto 4 (nombre): ");
        String nombre4 = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad4 = sc.nextInt();
        System.out.print("Precio Unitario ($): ");
        double precio4 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Producto 5 (nombre): ");
        String nombre5 = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad5 = sc.nextInt();
        System.out.print("Precio Unitario ($): ");
        double precio5 = sc.nextDouble();
        sc.nextLine();

        double subtotal1 = cantidad1 * precio1;
        double subtotal2 = cantidad2 * precio2;
        double subtotal3 = cantidad3 * precio3;
        double subtotal4 = cantidad4 * precio4;
        double subtotal5 = cantidad5 * precio5;

        int totalCantidades = cantidad1 + cantidad2 + cantidad3 + cantidad4 + cantidad5;
        double totalSubtotales = subtotal1 + subtotal2 + subtotal3 + subtotal4 + subtotal5;

        System.out.println("| Producto | Cantidad | Precio Unit. | Subtotales |");
        System.out.println("----------------------------------------------------");
        System.out.printf("| %S | %d | %s | %s%n |", nombre1, cantidad1, df.format(precio1), df.format(subtotal1));
        System.out.printf("| %S | %d | %s | %s%n |", nombre2, cantidad2, df.format(precio2), df.format(subtotal2));
        System.out.printf("| %S | %d | %s | %s%n |", nombre3, cantidad3, df.format(precio3), df.format(subtotal3));
        System.out.printf("| %S | %d | %s | %s%n |", nombre4, cantidad4, df.format(precio4), df.format(subtotal4));
        System.out.printf("| %S | %d | %s | %s%n |", nombre5, cantidad5, df.format(precio5), df.format(subtotal5));
        System.out.println("----------------------------------------------------");
        System.out.printf("| TOTALES | %d |  | %s |", totalCantidades, df.format(totalSubtotales));


    }
}
