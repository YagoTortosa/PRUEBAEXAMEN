import java.util.Scanner;

public class EJ6_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero positivo: ");
        int numero = sc.nextInt();

        while (numero <= 0) {
            System.out.print("Error, solicitar de nuevo: ");
            numero = sc.nextInt();
        }

        String numeroString = String.valueOf(numero);

        System.out.print("Introduce la posición dentro del numero: ");
        int posicion = sc.nextInt();

        System.out.print("Introduce el nuevo digito: ");
        int digito = sc.nextInt();


        while (numero > 0) {

            for (int i = 0; i < numeroString.length(); i++) {
                if (numeroString.charAt(i) == digito) {
                    digito = posicion;
                }
            }
        }

        System.out.println("El numero resultante es: " + numeroString);

    }
}
