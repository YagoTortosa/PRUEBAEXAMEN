import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");

        System.out.print("Introduce la Hora (HH:MM:SS): ");
        String horaCompleta = scanner.nextLine();

        char h1 = horaCompleta.charAt(0);
        char h2 = horaCompleta.charAt(1);
        char m1 = horaCompleta.charAt(3);
        char m2 = horaCompleta.charAt(4);
        char s1 = horaCompleta.charAt(6);
        char s2 = horaCompleta.charAt(7);


        String hora = "" + h1 + h2;
        String minuto = "" + m1 + m2;
        String segundo = "" + s1 + s2;

        int horaInt = Integer.parseInt(hora);
        int minutoInt = Integer.parseInt(minuto);
        int segundoInt = Integer.parseInt(segundo);


        String entrada = df.format(horaInt) + ":" + df.format(minutoInt) + ":" + df.format(segundoInt);

        segundoInt++;

        if (segundoInt == 60) {
            segundoInt = 0;
            minutoInt++;
            if (minutoInt == 60) {
                minutoInt = 0;
                horaInt++;
                if (horaInt == 24) {
                    horaInt = 0;
                }
            }
        }

        String salida = df.format(horaInt) + ":" + df.format(minutoInt) + ":" + df.format(segundoInt);

        System.out.println("Entrada: " + entrada);
        System.out.println("Salida:  " + salida);
    }
}
