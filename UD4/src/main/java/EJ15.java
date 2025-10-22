import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tus horas de trabajo: ");
        int horas = sc.nextInt();
        System.out.print("Introduce la tarifa por hora: ");
        int tarifa = sc.nextInt();

        double retencion = 0.15;
        double pagaEnBruto = horas * tarifa;
        double pagaEnNeto = pagaEnBruto - (pagaEnBruto * retencion);

        System.out.println("Tu paga en bruto es de " + pagaEnBruto + " y en neto " + pagaEnNeto + " (retención del 15%)");


    }
}
