import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        int numero = Integer.parseInt(cadena);

        int suma = numero + 10;

        System.out.printf("Resultado al sumar 10 a %d es: %d%n ", numero, suma);
    }
}
