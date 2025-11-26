import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sumaValores = 0;

        final int TAM = 5;
        double[] numeros = new double[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Introduce numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            sumaValores += numeros[i];
        }

        double mediaValores = sumaValores / TAM;

        System.out.println("Media de los valores: " + mediaValores);
    }
}
