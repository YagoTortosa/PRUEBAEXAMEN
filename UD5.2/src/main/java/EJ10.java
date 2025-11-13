import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        boolean notaCon10 = false;
        

        do {
            System.out.print("Introduce nota: ");
            nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("El rango de nota es de 0 a 10");
            } else if (nota == 10) {
                notaCon10 = true;
            }

        } while (nota != -1);

        if (notaCon10) {
            System.out.println("Se ha introducido al menos un 10");
        }
    }
}
