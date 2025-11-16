import java.util.Scanner;

public class EJ1_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        int logitudPalabra = palabra.length() / 2;

        for (int i = 0; i < logitudPalabra; i++) {
            System.out.println(palabra);
        }
    }
}
