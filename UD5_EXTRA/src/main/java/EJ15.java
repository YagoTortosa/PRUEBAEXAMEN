import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        final double ivaGeneral = 0.21;
        final double ivaReducido = 0.1;
        final double ivaSuperReducido = 0.04;

        final String noPromo = "No se aplica promoción";
        final double promo50por = 0.5;
        final int promo5eur = 5;
        final double promo5por = 0.05;



        System.out.print("Introduce la base imponible: ");
        double base = sc.nextDouble();


        System.out.print("Introduce el tipo de IVA (general, reducido o superReducido): ");
        String tipo = sc.next();


        double precioConIva = 0;

        switch (tipo) {
            case "general" -> precioConIva = base + ivaGeneral;
            case "reducido" -> precioConIva = base + ivaReducido;
            case "superReducido" -> precioConIva = base + ivaSuperReducido;
            default -> System.out.println("No existe ese tipo de IVA");
        }


        System.out.print("Introduce el código promocional (nopromo, promo50por, promo5eur, promo5por): ");
        String codPromocional = sc.next();

        switch (codPromocional) {
            case "nopromo" -> System.out.println(noPromo);
            case "promo50por" -> precioConIva = precioConIva - promo50por;
            case "promo5eur" -> precioConIva = precioConIva - promo5eur;
            case "promo5por" -> precioConIva = precioConIva - promo5por;
            default -> System.out.println("No existe ese codigo promocional");
        }



        System.out.println("Base imponible \t" + df.format(base));
        System.out.println("IVA (21%) \t" + tipo);
        System.out.println("Precio con IVA \t" + precioConIva);
        System.out.println("Cód. promo. (" + codPromocional + ") - " + precioConIva);
        System.out.println("TOTAL \t" + precioConIva);



    }
}
