import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor del lado: ");
        int lado = sc.nextInt();

        int area = lado * lado;
        System.out.print("El area del cuadrado es: " + area);

    }
}
