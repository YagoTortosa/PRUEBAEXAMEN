import java.util.Scanner;

public class EJ4_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();

        final char asterisco = '*';
        final char hastag = '#';

        char caracterImprimido;

        if (numero <= 0) {
            caracterImprimido = hastag;
        } else {
            caracterImprimido = asterisco;
        }

        int numeroAbsoluto = Math.abs(numero);

        for (int i = 1; i <= numeroAbsoluto; i++) {
            System.out.print(caracterImprimido);
        }


    }
}
