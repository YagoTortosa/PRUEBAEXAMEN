import java.util.Scanner;

public class EJ13_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide: ");
        int altura = sc.nextInt();
        System.out.print("Introduce el carácter de relleno: ");
        char caracter = sc.next().charAt(0);

        // Bucle para cada nivel de la pirámide
        for (int fila = 1; fila <= altura; fila++) {

            // 1️⃣ Imprimir espacios (pirámide centrada)
            for (int espacio = 1; espacio <= altura - fila; espacio++) {
                System.out.print(" ");
            }

            // 2️⃣ Imprimir caracteres (2*fila - 1)
            for (int col = 1; col <= (2 * fila - 1); col++) {
                System.out.print(caracter);
            }

            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}
