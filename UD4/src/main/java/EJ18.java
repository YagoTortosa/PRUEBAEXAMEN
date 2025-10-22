
import java.util.Scanner;

public class EJ18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de barras frescas vendidas: ");
        int barrasFrescas = sc.nextInt();
        System.out.print("Introduce el numero de barras que no son del dia: ");
        int barrasPasadasDeFecha = sc.nextInt();

        double barraPan = 1.20;
        double barraPanPasada = 1.20 - 0.60;

        double barrasDePan = barraPan * barrasFrescas;
        double barrasDePanPasadas = barraPanPasada * barrasPasadasDeFecha;


        double totalIngresos = barrasDePan + barrasDePanPasadas;

        System.out.printf("El total de ingresos del dia es: " + totalIngresos + "€");
    }
}
