public class EJ15 {
    public static void main(String[] args) {

        final int TAM = 100;
        int [] numeros = new int [TAM];

        for (int i = 0; i < TAM; i++) {
            numeros[i] = i + 1;
        }

        System.out.println(calculoMedia(numeros));
        System.out.println(calculoSuma(numeros));



    }
    public static int calculoSuma(int [] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public static int calculoMedia(int [] numeros) {
        return calculoSuma(numeros)/numeros.length;

    }
}
