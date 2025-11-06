import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad < 16) {
            System.out.println("La edad para tributar debe ser mayor o igual a 16");
        } else {
            System.out.print("Introduce tus ingresos: ");
            double ingresos = sc.nextDouble();

            if (ingresos >= 1000) {
                System.out.println("Debes tributar");
            } else {
                System.out.println("No debes tributar");
            }
        }
    }
}
