import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.print("Introduzca el tercer numero: ");
        int num3 = sc.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Son iguales");
        } else if (num1 > num2 && num1 > num3) {
            System.out.println("El primer numero es el mayor ");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El segundo numero es el mayor");
        } else {
            System.out.println("El tercero es el mayor");
        }
    }
}
