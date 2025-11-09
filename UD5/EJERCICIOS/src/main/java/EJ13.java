import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();


        if (edad > 18) {
            System.out.println("El precio de la entrada es 10$");
        } if (edad <= 17 && edad > 4) {
            System.out.println("El precio de la entrada es 5$");
        } if (edad <= 4) {
            System.out.println("El precio de la entrada es gratuita");
        }
    }
}
