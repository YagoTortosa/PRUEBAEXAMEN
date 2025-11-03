import java.util.Scanner;

public class EJ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el dividendo (entero): ");
        int dividendo = sc.nextInt();
        System.out.print("Introduce el divisor (entero): ");
        int divisor = sc.nextInt();

        int c = dividendo/divisor;
        int r = dividendo%divisor;

        System.out.println(dividendo + " entre " + divisor + " da un cociente " + c + " y un resto " + r);
    }
}
