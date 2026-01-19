import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer valor: ");
        double valor1 = sc.nextDouble();
        System.out.print("Introduce el segundo valor: ");
        double valor2 = sc.nextDouble();
        System.out.print("Introduce el tercer valor: ");
        double valor3 = sc.nextDouble();

        double maximoTemporal = numeroMaximo(valor1, valor2);
        double maximoFinal = numeroMaximo(maximoTemporal, valor3);

        System.out.println("El número máximo entre " + valor1 + ", " + valor2 + " y " + valor3 + " es: " + maximoFinal);



    }
    public static double numeroMaximo(double a, double b) {
        return Math.max(a, b);
    }


}
