import java.sql.SQLOutput;
import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el radio: ");
        double radio = sc.nextInt();
        System.out.println("Introduce la altura: ");
        double altura = sc.nextInt();



        double volumen = (1.0/3) * Math.PI * Math.pow(radio,2) * altura;

        System.out.println("El volumen es: " + volumen);
    }
}
