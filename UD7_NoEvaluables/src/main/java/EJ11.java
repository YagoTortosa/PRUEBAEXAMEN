import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número para ver su tabla de multiplicar: ");
        int numero = sc.nextInt();

        tablaMultiplicar(numero);


    }

    public static void tablaMultiplicar(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
