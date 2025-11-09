import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un dia: ");
        String dia = sc.nextLine();

        if (dia.equals("Lunes")) {
            System.out.println("A primera hora toca Fisica");
        } else if (dia.equals("Martes")) {
            System.out.println("A primera hora toca Mates");
        } else if (dia.equals("Miercoles")) {
            System.out.println("A primera hora toca E.F");
        } else if (dia.equals("Jueves")) {
            System.out.println("A primera hora toca FOL");
        } else if (dia.equals("Viernes")) {
            System.out.println("A primera hora toca Programacion");
        }


    }
}
