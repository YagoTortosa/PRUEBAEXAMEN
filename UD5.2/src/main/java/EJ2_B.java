import java.util.Scanner;

public class EJ2_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("En que anyo naciste? ");
        int anyo = sc.nextInt();

        final int anyoActual = 2026;
        int edadCalculada = anyoActual - anyo;

        for (int i = 1; i <= edadCalculada; i++) {
            System.out.println("Has cumplido " + i + " anos");
        }

    }
}
