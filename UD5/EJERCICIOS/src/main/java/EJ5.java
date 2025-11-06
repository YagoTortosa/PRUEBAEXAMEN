import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("El numero es positivo.");
        } else {
            System.out.println("El numero es negativo.");
        }
    }
}
