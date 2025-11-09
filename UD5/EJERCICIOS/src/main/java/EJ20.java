import java.util.Scanner;

public class EJ20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce tus horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();
        System.out.print("Introduce la tarifa por hora: ");
        double tarifaPorHora = sc.nextDouble();


        double tasaImpuestos = 0;
        double salarioBruto = horasTrabajadas * tarifaPorHora;
        double salarioNeto = salarioBruto - (salarioBruto * tasaImpuestos);



        if (horasTrabajadas > 35) {
            tarifaPorHora = tarifaPorHora * 1.5;
        }


        if (salarioBruto <= 500) {
            System.out.println("Estas libre de impuestos");
        } else if (salarioBruto <= 900) {
            tasaImpuestos = 0.25;
        } else if (salarioBruto > 900) {
            tasaImpuestos = 0.45;
        }


        System.out.println("\nPor las " + horasTrabajadas + " horas trabajadas, a " + nombre + " le corresponde un salario bruto de " + salarioBruto + " y un neto de " + salarioNeto + " tras aplicar " + tasaImpuestos + " euros de impuestos.");


    }
}
