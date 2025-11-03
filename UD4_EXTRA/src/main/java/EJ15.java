import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String palabra = sc.nextLine();

        String palabraTransformada = Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1, palabra.length() - 1) + Character.toUpperCase(palabra.charAt(palabra.length() - 1));

        System.out.println("Palabr transformada: " + palabraTransformada);

    }
}
