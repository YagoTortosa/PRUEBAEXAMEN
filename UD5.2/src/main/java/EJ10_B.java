import java.util.Scanner;

public class EJ10_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contLetras = 0;

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.print("Introduce una letra: ");
        char letra = sc.next().charAt(0);

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contLetras++;
            }
        }

        System.out.println("La letra " + "'" + letra + "'" + " aparece " + contLetras + " veces en la frase " + "'" + frase + "'");

    }
}
