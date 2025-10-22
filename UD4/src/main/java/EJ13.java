import java.sql.SQLOutput;
import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un valor en millas: ");
        int distancia = sc.nextInt();

        int milla = 1852;
        int metros = milla * distancia;

        System.out.println("La distancia es de " + metros + " metros");
    }
}
