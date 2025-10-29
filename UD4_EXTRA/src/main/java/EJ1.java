import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cantidad de segundos: ");
        int cantidadSegundos = sc.nextInt();

        int dias = cantidadSegundos / 86400;
        int horas = (cantidadSegundos % 86400) / 3600;
        int minutos = (cantidadSegundos % 3600) / 60;
        int segundos = cantidadSegundos % 60;



        System.out.println("Equivale a: " + dias + " día(s)" + ", " + horas + " hora(s)" + ", " + minutos + " minuto(s)" + " y " + segundos + " segundo(s)");
    }
}
