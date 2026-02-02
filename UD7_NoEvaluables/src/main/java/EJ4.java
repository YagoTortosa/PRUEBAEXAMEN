import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = sc.nextInt();


        if (dimeSigno(num) == 1) {
            System.out.println("Positivo.");
        } else if (dimeSigno(num) == -1) {
            System.out.println("Negativo.");
        } else {
            System.out.println("Cero.");
        }

    }
    public static int dimeSigno(int a) {
        if (a > 0) {
            return 1;
        } else if (a < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
