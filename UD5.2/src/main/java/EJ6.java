import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean numeroNegativo = false;

        for (int i = 0; i < 100; i++) {
            System.out.print("Introduzca un numero " + (i + 1) + ": ");
            int num = sc.nextInt();

            if (num < 0) {
                numeroNegativo = true;
            }

        }
        if (numeroNegativo) {
            System.out.println("Se ha leido al menos un numero negativo.");
        } else {
            System.out.println("No se ha leido ningun numero negativo.");
        }
    }
}

