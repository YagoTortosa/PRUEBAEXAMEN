import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de empanadillas a enviar: ");
        int empanadas = sc.nextInt();
        System.out.print("Introduce el numero de napolitanas a enviar: ");
        int napolitanas = sc.nextInt();

        double empanadilla = 112;
        double napolitana = 75;

        double pesoEmpanadillas = empanadas * empanadilla;
        double pesoNapolitanas = napolitanas * napolitana;

        double pesoPaquete = (pesoEmpanadillas + pesoNapolitanas) / 1000;

        System.out.println("El peso total del paquete es: " + pesoPaquete + " Kg");



    }
}
