import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sumaValores = 0;
        double media = 0;

        final int TAM = 5;
        int [] numeros = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Introduce numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            sumaValores += numeros[i];
            media = sumaValores / TAM;
        }

        
    }
}
