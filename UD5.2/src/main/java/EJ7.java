import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numerosPositivos = 0, numerosNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca un numero " + (i + 1) + ": ");
            int num = sc.nextInt();

            if (num > 0) {
                numerosPositivos++;
            } else {
                numerosNegativos++;
            }
        }
        System.out.println("Se han leido " + numerosPositivos + " numeros positivos.");
        System.out.println("Se han leido " + numerosNegativos + " numeros negativos.");
    }
}
