import java.util.Scanner;

public class EJ6_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadMultiplos = 0;

        System.out.print("Introduce N: ");
        int n = sc.nextInt();



        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                cantidadMultiplos++;
            }
        }

        System.out.println("Cantidad de multiplos: " + cantidadMultiplos);

    }
}
