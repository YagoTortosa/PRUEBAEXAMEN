import java.util.Scanner;

public class EJ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el dividendo (entero): ");
        int n = sc.nextInt();
        System.out.print("Introduce el divisor (entero): ");
        int m = sc.nextInt();

        int c = n / m;
        int d = n % m;

        System.out.print(n + "  entre " + m + " da un cociente " + c + " y un resto " + d);
    }
}
