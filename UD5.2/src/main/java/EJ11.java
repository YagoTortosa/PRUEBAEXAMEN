public class EJ11 {
    public static void main(String[] args) {


        int contPares = 0;
        int contImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }  else {
                sumaImpares += i;
            }
        }
        System.out.println("La suma de los pares es " + sumaPares);
        System.out.println("La suma de los impares es " + sumaImpares);
    }
}
