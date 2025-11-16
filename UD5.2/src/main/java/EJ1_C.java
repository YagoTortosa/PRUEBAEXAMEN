import java.util.Scanner;

public class EJ1_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Leer dos números
        System.out.print("Introduce n1: ");
        int n1 = sc.nextInt();

        System.out.print("Introduce n2: ");
        int n2 = sc.nextInt();


        while (n1 >= n2) {
            System.out.println("Error: n1 debe ser menor que n2: ");
            n2 = sc.nextInt();
        }

        // 3. Orden creciente
        System.out.println("Números en orden creciente:");
        for (int i = n1; i <= n2; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 4. Orden decreciente
        System.out.println("Números en orden decreciente:");
        for (int i = n2; i >= n1; i--) {
            System.out.print(i + " ");
        }
    }
}
