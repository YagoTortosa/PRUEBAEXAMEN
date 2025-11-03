import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Elige una opción del 1 al 3: ");
        System.out.println("\n1. Celsius → Fahrenheit");
        System.out.println("2. Fahrenheit → Celsius");
        System.out.println("3. Kelvin → Celsius");
        int opcion = sc.nextInt();

        System.out.println("Introduce una temperatura:");
        double temperatura = sc.nextDouble();

        switch (opcion) {
            case 1:
                double fahrenheit = (temperatura * 9 / 5) + 32;
                System.out.println(df.format(temperatura) + " °C son " + df.format(fahrenheit)+ " °F");
                break;

            case 2:
                double celsius = (temperatura - 32) * 5 / 9;
                System.out.println(df.format(temperatura) + " °F son " + df.format(celsius) + " °C");
                break;

            case 3:
                double kelvin = temperatura - 273.15;
                System.out.println(df.format(temperatura) + " K son " + df.format(kelvin) + " °C");
                break;
            default:
                System.out.println("Opción no válida. Debe ser 1, 2 o 3.");
        }
    }
}
