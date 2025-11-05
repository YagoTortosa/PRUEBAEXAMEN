import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + "\n" + num2);
        } else {
            System.out.println(num2 + "\n" + num1);
        }
    }
}
