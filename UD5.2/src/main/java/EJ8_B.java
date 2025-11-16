import java.util.Scanner;

public class EJ8_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadPares = 0;

        System.out.print("Introduce N1: ");
        int n1 = sc.nextInt();

        System.out.print("Introduce N2: ");
        int n2 = sc.nextInt();

        while (n2 <= n1) {
            System.out.print("N2 debe ser mayor que N1. Vuelve a introducir N2: ");
            n2 = sc.nextInt();
        }

        for (int i = n1; i <= n2; i++) {
            if (i < n2) {
                System.out.print(i + " - ");
            } else {
                System.out.print(i);
            }

            if (i % 2 == 0) {
                cantidadPares++;
            }
        }

        System.out.print("\nLa cantidad de pares: " + cantidadPares);
    }
}
