import java.util.Scanner;

public class EJ2_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce N1: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce N2: ");
        int n2 = sc.nextInt();

        while (n2 <= n1)  {
            System.out.println("Error: n2 debe ser mayor que n1: ");
            n2 = sc.nextInt();
        }

        for (int i = n1; i <= n2; i++) {
            if (i % n1 == 0) {
                System.out.println(i + " ");
            }
        }

        System.out.println();

        for (int i = n2; i >= n1; i--) {
            if (i % n2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
