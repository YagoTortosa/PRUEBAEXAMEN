import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.printf("MAYUSCULAS: %S%n", frase);
        System.out.printf("minúsculas: %s", frase.toLowerCase());
    }
}
