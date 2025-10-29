import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####.##");

        System.out.println("Cantidad a invertir: ");
        double cantidadParaInvertir = sc.nextDouble();
        System.out.println("Interes porcentual anual: ");
        double interesPorcentualAnual = sc.nextDouble();
        System.out.println("Duración de la inversión en meses: ");
        double duracionInversion = sc.nextDouble();

        double duracionEnAnyos = duracionInversion / 12;
        double rendimiento = cantidadParaInvertir * Math.pow(interesPorcentualAnual / 100 + 1, duracionEnAnyos);

        System.out.println("Capital final: " + df.format(rendimiento));

    }
}
