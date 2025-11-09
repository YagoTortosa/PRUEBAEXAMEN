import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double menor10k = 0.05;
        final double menor20k = 0.15;
        final double menor35k = 0.20;
        final double menor60k = 0.30;
        final double mayorIgual60k = 0.45;

        double impuesto = 0;

        System.out.print("Introduce tu renta anual: ");
        double rentaAnual = sc.nextDouble();

        if (rentaAnual <= 0) {
            System.out.println("La renta no puede ser negativo");
        } else {
            if (rentaAnual < 10000) {
                impuesto = menor10k;
            } else if (rentaAnual < 20000) {
                impuesto = menor20k;
            } else if (rentaAnual < 35000) {
                impuesto = menor35k;
            } else if (rentaAnual < 60000) {
                impuesto = menor60k;
            } else {
                impuesto = mayorIgual60k;
            }
        }
        
        System.out.println("Se te ha aplicado un tipo impositivo del " + (impuesto * 100) + "%");

    }
}
