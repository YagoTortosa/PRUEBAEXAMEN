import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un valor entero en millas: ");
        int millas = sc.nextInt();

        System.out.println(millas + " millas son " + millas_a_kilometros(millas) + " kilómetros.");


    }
    public static double millas_a_kilometros(int millas) {
        return millas * 1.60934;
    }
}
