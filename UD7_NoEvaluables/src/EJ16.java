import java.util.Arrays;
import java.util.Scanner;

public class EJ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int tam = sc.nextInt();

        int[] array = new int[tam];

        rellenarArray(array);

        System.out.println(Arrays.toString(array));

    }


    public static void rellenarArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }



}
