import java.util.Scanner;

public class EJ11_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int numeroAnterior;
        int errores = 0;
        int numerosIntroducidos;
        int numerosValidos;

        System.out.print("Numero 1: ");
        numeroAnterior = sc.nextInt();

        if (numeroAnterior == 0) {
            System.out.println("No se han introducido numeros");
        }

        numerosIntroducidos = 1;
        numerosValidos = 1;

        int contador = 2;

        do {
            System.out.print("Numero " + contador + ": ");
            numero = sc.nextInt();

            if (numero != 0) {
                numerosIntroducidos++;

                if (numero > numeroAnterior) {
                    numerosValidos++;
                } else {
                    errores++;
                    System.out.println("Fallo! Errores: " + errores);
                }

                numeroAnterior = numero;
            }

            contador++;

        } while (numero != 0);

        System.out.println("-------------------------------------");
        System.out.print("Total de números introducidos: " + numerosIntroducidos);
        System.out.print("\nTotal de números válidos: " + numerosValidos);
        System.out.print("\nTotal de fallos: " + errores);
    }
}
