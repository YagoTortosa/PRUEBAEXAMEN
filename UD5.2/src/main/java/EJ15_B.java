import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ15_B {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");

        boolean horaValida;
        int horaInt;
        int minutoInt;
        int segundoInt;

        do {
            System.out.print("Introduce una hora en formato (HH:MM:SS): ");
            String horaCompleta = sc.nextLine();
            horaValida = true;

            if (horaCompleta.isEmpty()) {
                System.out.print("Formato incorrecto, vuelve a introducirla: ");
            }

            char h1 = horaCompleta.charAt(0);
            char h2 = horaCompleta.charAt(1);
            char doblePunto1 = horaCompleta.charAt(2);
            char m1 = horaCompleta.charAt(3);
            char m2 = horaCompleta.charAt(4);
            char doblePunto2 = horaCompleta.charAt(5);
            char s1 = horaCompleta.charAt(6);
            char s2 = horaCompleta.charAt(7);

            String hora = "" + h1 + h2;
            String minuto = "" + m1 + m2;
            String segundo = "" + s1 + s2;

            horaInt = Integer.parseInt(hora);
            minutoInt = Integer.parseInt(minuto);
            segundoInt = Integer.parseInt(segundo);

            if (horaCompleta.length() != 8) {
                horaValida = false;
                System.out.print("Formato incorrecto, vuelve a introducirla: ");
            } else if (doblePunto1 != ':' || doblePunto2 != ':') {
                horaValida = false;
                System.out.print("Formato incorrecto, vuelve a introducirla: ");
            } else if (horaInt >= 24 || minutoInt >= 60 || segundoInt >= 60) {
                horaValida = false;
                System.out.print("Formato incorrecto, vuelve a introducirla: ");
            }

        } while (!horaValida);

        while (true) {

            Thread.sleep(1000);

            segundoInt++;
            if (segundoInt == 60) {
                segundoInt = 0;
                minutoInt++;
            }
            if (minutoInt == 60) {
                minutoInt = 0;
                horaInt++;
            }
            if (horaInt == 24) {
                horaInt = 0;
            }

            String horaFinal = df.format(horaInt) + ":" + df.format(minutoInt) + ":" + df.format(segundoInt);
            System.out.println(horaFinal);

        }
    }
}