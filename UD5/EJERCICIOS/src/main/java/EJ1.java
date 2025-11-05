import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
    }
}
