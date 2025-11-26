import java.util.Arrays;
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce valor N: ");
        int n = sc.nextInt();
        System.out.print("Introduce valor M: ");
        int m = sc.nextInt();

        int []numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = m;
        }

        System.out.println(Arrays.toString(numeros));



    }
}
