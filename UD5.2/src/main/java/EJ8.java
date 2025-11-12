import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int numeroNegativos = 0;
        int numeroPositivos = 0;
        boolean numNegativo = false;

        do {
            System.out.print("Introduzca un numero: ");
            numero = sc.nextInt();

            if (numero < 0) {
                numNegativo = true;
                numeroNegativos++;
            } else {
                numeroPositivos++;
            }

        } while (numero != 0);

        if (numNegativo) {
            System.out.println("Se ha introducido al menos un numero negativo.");
        }
        System.out.println("Se han leido " + numeroPositivos + " numeros positivos.");
        System.out.println("Se han leido " + numeroNegativos + " numeros negativos.");
    }
}
