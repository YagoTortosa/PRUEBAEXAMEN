import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una distancia en kilómetros: ");
        int km = sc.nextInt();

        pasarKilometrosAMillas(km);




    }
    public static void pasarKilometrosAMillas(int kilometros) {
        double millas = kilometros / 1.60934;
        System.out.println(kilometros + " kilómetros son " + millas + " millas.");
    }


}
