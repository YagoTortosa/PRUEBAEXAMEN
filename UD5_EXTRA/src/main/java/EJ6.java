import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        int num = sc.nextInt();

        String numero = Integer.toString(Math.abs(num));

        if (num > 9999) {
            System.out.println("El numero debe tener menos de 5 cifras");
        } else {
            System.out.println("El numero tiene " + numero.length() + " cifras");
        }
    }
}
