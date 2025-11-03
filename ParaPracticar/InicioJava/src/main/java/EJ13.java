import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un valor en millas marinas: ");
        double valor = sc.nextDouble();

        double milla = 1.852;
        double metros = valor * milla;

        System.out.println("La distancia en metros: " + metros);
    }
}
