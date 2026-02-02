import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (esMayorDeEdad(edad)) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }




    }
    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }
}
