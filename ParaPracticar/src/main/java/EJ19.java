import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Cantidad a invertir: ");
        int cantidad = sc.nextInt();

        System.out.print("Interés porcentual anual: ");
        double interesPorcentualAnual = sc.nextInt();

        System.out.print("Duración de la inversion en meses: ");
        int duracionMensual = sc.nextInt();

        int duracionEnAnyos = duracionMensual / 12;

        double rendimiento = cantidad * Math.pow((interesPorcentualAnual / 100 + 1), duracionEnAnyos);

        System.out.println("Capital final: " + df.format(rendimiento));

    }
}
