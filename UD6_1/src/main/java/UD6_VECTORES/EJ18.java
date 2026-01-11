package UD6_VECTORES;

import java.util.Arrays;

public class EJ18 {
    public static void main(String[] args) {

        int aleatorio;

        final int TAM = 30;

        int [] array = new int[TAM];

        for (int i = 0; i < array.length; i++) {
            aleatorio = (int) (Math.random() * 10);
            array[i] = aleatorio;
        }

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
