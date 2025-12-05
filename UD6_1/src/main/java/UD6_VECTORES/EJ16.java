package UD6_VECTORES;

public class EJ16 {
    public static void main(String[] args) {

        int tam = 0;
        for (int j = 0; j < 10; j++) {
            tam += j;
        }

        int []array = new int[tam];
        int indice = 0;

        for (int i = 0; i < array.length; i++) {
            array[indice] = i;
            indice++;
        }

    }
}
