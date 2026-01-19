import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int n = sc.nextInt();


        System.out.println("La suma de 1 a " + n + " es: " + suma1aN(n));
        System.out.println("El producto de 1 a " + n + " es: " + producto1aN(n));









    }
    public static int suma1aN(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
    public static int producto1aN(int n) {
        int producto = 1;
        for (int i = 1; i <= n; i++) {
            producto *= i;
        }
        return producto;
    }
    public static double intermedio1aN(int n) {
        int sumaFuncionTres = suma1aN(n);
        int numeroIntermedio;
        String [] numeros = Integer.toString(sumaFuncionTres).split("");
        for (int i = 1; i <= n;) {
            numeroIntermedio = numeros.length / 2;
            return numeroIntermedio;
        }
        return 0;
    }
}
