import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu dia de nacimiento: ");
        int diaNacimiento = sc.nextInt();
        System.out.print("Introduce el mes de nacimiento: ");
        String mesNacimiento = sc.next();

        final String enero = "Enero";
        final String febrero = "Febrero";
        final String marzo = "Marzo";
        final String abril = "Abril";
        final String mayo = "Mayo";
        final String junio = "Junio";
        final String julio = "Julio";
        final String agosto = "Agosto";
        final String septiembre = "Septiembre";
        final String octubre = "Octubre";
        final String noviembre = "Noviembre";
        final String diciembre = "Diciembre";

        if (diaNacimiento > 21 && diaNacimiento < 31 && mesNacimiento.equals(marzo)) {
            System.out.println("Eres Aries");
        } else if (diaNacimiento > 1 && diaNacimiento < 19 && mesNacimiento.equals(abril)) {
            System.out.println("Eres  Aries");
        } else if (diaNacimiento > 20 && diaNacimiento < 30 && mesNacimiento.equals(febrero)) {
            System.out.println();
        }

    }
}
