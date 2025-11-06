import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");

        System.out.print("Introduce : ");
        String horaCompleta = scanner.nextLine();


        char h1 = horaCompleta.charAt(0);
        char h2 = horaCompleta.charAt(1);
        char m1 = horaCompleta.charAt(3);
        char m2 = horaCompleta.charAt(4);
        char s1 = horaCompleta.charAt(7);
        char s2 = horaCompleta.charAt(8);

        /*int horas = Integer.parseInt()

        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }

        System.out.println("Salida: " + df.format(horas) + ":" + df.format(minutos) + ":" + df.format(segundos))*/;
    }
}