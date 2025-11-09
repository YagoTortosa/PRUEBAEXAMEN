import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce un numero entero: ");
        int num = sc.nextInt();

        int ultimacifra = Math.abs(num % 10);

        System.out.println("La ultima cifra del numero es: " + ultimacifra);

    }
}
