import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();


        if ((num % 2 == 0) && (num % 5 == 0)) {
            System.out.println("Es divisible entre 5 y es par");
        } else if ((num % 2 != 0) && (num % 5 == 0)) {
            System.out.println("No es par pero divisible entre 5");
        } else if ((num % 2 == 0) && (num % 5 != 0)) {
            System.out.println("Es par pero no divisible entre 5");
        } else {
            System.out.println("No es divisible entre 5 y es impar");
        }
    }
}
