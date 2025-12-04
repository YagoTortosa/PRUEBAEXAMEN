import java.util.Arrays;
import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce valor N: ");
        int n = input.nextInt();
        System.out.print("Introduce valor M: ");
        int m = input.nextInt();


        int []array = new int[n];

        Arrays.fill(array, m);

        System.out.println(Arrays.toString(array));
    }
}
