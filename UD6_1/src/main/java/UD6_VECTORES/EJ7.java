package UD6_VECTORES;

import java.util.Arrays;
import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce valor P: ");
        int p = input.nextInt();
        System.out.print("Introduce valor Q: ");
        int q = input.nextInt();

        int[] array = new int[q-p+1];

        for (int i = 0; i < array.length; i++) {
            array[i] = p + i;
        }

        System.out.println(Arrays.toString(array));
    }
}
