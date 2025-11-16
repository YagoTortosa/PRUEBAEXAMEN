import java.util.Scanner;

public class EJ4_C {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = entrada.nextInt();
        System.out.print("Introduce un digito: ");
        char digito = entrada.next().charAt(0);

        String numeroString = String.valueOf(numero);
        int numApariciones = 0;


        for (int i = 0; i < numeroString.length(); i++) {
            if (numeroString.charAt(i) == digito) {
                numApariciones++;
                System.out.println(" - Posición " + (i + 1));
            }
        }

        System.out.println("El digito " + digito + " aparece " + numApariciones + " veces en el numero");


    }
}
