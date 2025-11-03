import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Introduce la inversión inicial: ");
        double inversion = sc.nextDouble();

        double interesAnual = 0.04;
        double balance1 = inversion * (1 + interesAnual);
        double balance2 = balance1 * (1 + interesAnual);
        double balance3 = balance2 * (1 + interesAnual);

        System.out.println("Balance 1: " + df.format(balance1));
        System.out.println("Balance 2: " + df.format(balance2));
        System.out.println("Balance 3 y final: " + df.format(balance3));


    }
}
