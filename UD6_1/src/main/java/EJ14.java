import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (int i = 1; i < 10; i++) {
            int []array = new int[10];
            for (int j = i; j < array.length; j++) {
                array[j] = j;
                System.out.print(array[j]);
            }
        }

    }
}
