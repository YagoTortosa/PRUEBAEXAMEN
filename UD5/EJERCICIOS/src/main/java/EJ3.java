import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El primer numero es mayor que el segundo numero");
        } else if (num1 == num2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("El segundo numero es mayor que el primer numero");
        }
    }
}
