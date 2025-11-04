import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una hora (HH): ");
        int horas = sc.nextInt();
        System.out.print("Introduce los minutos (MM): ");
        int minutos = sc.nextInt();
        System.out.print("Introduce los segundos (SS): ");
        int segundos = sc.nextInt();

        int segundoSumado = segundos + 1;
        String error = "Formato incorrecto!";

        if (horas > 24) {
            error = "Horas excedido!" + horas;
        }
        if (minutos > 60) {
            error = "Minutos excedido!" + minutos;
        }
        if (segundos > 60) {
            error = "Segundos excedido!" + segundos;
        }

        else {
            if (segundoSumado == 60) {
                segundos = 0;
                minutos = minutos + 1;
            }

            if (minutos == 60) {
                minutos = 0;
                horas = horas + 1;
            }

            if (horas == 24) {
                horas = 0;
            }


            System.out.println("Entrada: " + horas + ":" + minutos + ":" + segundos);
            System.out.println("Salida: " + horas + ":" + minutos + ":" + segundos);

        }
    }
}
