import java.util.Scanner;

public class EJ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un anyo: ");
        int anyo = sc.nextInt();

        if (anyo % 4 == 0 && anyo % 100 != 0) {
            System.out.println("Es bisiesto");
        } else if (anyo % 400 == 0) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }
}
