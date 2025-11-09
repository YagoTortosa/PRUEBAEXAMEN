import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();

        String numero = String.valueOf(num);

        if (num > 9999) {
            System.out.println("Solo se permiten numeros de hasta 5 cifras");
        } else {
            System.out.println(numero.charAt(0));
        }
    }
}
