import java.util.Scanner;

public class EJ18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de empanadillas a enviar: ");
        int empanadillas = sc.nextInt();
        System.out.print("Introduce el número de napolitanas a enviar: ");
        int napolitanas = sc.nextInt();

        double empanadilla = 112;
        double napolitana = 75;

        double cantidadEmpanadillas = empanadilla * empanadillas;
        double cantidadNapolitanas = napolitana * napolitanas;

        double pesoTotal = (cantidadEmpanadillas + cantidadNapolitanas) / 1000;

        System.out.println("El peso total del paquete es " + pesoTotal + " Kg");
    }
}
