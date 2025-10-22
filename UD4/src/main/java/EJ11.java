import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio: ");
        double radio = sc.nextDouble();

        double longitudCircunferencia = 2 * Math.PI * radio;
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        double volumenEsfera = 4.0 / 3.0 * Math.PI * Math.pow(radio, 3);

        System.out.println("El volumen esfera es: " + volumenEsfera);
        System.out.println("El area del circulo es: " + areaCirculo);
        System.out.println("La longitud del circulo es: " + longitudCircunferencia);
    }
}
