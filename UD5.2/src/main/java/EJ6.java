import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce numero:  ");
        int num = sc.nextInt();

        for (int i = 1; i <= 100; i++) {
            if (num < 0) {
                System.out.println("Se ha leido al menos un negativo");
            } else {
                System.out.println("No se ha leido ningun negativo");
            }
        }
    }
}
