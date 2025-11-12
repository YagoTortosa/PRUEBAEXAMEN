import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int producto = 1;

        for (int i = 1; i <= 10; i++) {
            suma += i;
            producto *= i;
        }
        System.out.println("La suma de los 10 primeros numeros son: " + suma);
        System.out.println("El producto de los 10 primeros numeros son: " + producto);
    }
}


