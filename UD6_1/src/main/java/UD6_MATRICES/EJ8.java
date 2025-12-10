package UD6_MATRICES;

public class EJ8 {
    public static void main(String[] args) {

        final String[] PAISES = {"España", "Alemania", "Francia", "Italia"};

        final int ESTATURA_MINIMA = 140;
        final int ESTATURA_MAXIMA = 210;
        final int ESTATURAS_DEPORTISTAS = 10;

        final int[][] ESTATURAS = new int[4][ESTATURAS_DEPORTISTAS];

        int anchoPais = 0;
        for (int i = 0; i < PAISES.length; i++) {
            if (PAISES[i].length() > anchoPais) {
                anchoPais = PAISES[i].length();
            }
        }

        anchoPais += 2;


        int anchoEstaturas = ESTATURAS_DEPORTISTAS * 4;
        int totalEspacios = anchoPais + anchoEstaturas + 2;
        System.out.printf("%" + totalEspacios + "s  MED MIN MAX%n", "");


        for (int pais = 0; pais < PAISES.length; pais++) {

            System.out.printf("%" + anchoPais + "s: ", PAISES[pais]);

            int suma = 0;
            int minima = ESTATURA_MAXIMA;
            int maxima = ESTATURA_MINIMA;

            for (int i = 0; i < ESTATURAS_DEPORTISTAS; i++) {

                int aleatorio = (int) (Math.random() * (ESTATURA_MAXIMA - ESTATURA_MINIMA + 1)) + ESTATURA_MINIMA;

                ESTATURAS[pais][i] = aleatorio;

                System.out.printf("%3d ", aleatorio);

                suma += aleatorio;
                minima = Math.min(minima, aleatorio);
                maxima = Math.max(maxima, aleatorio);
            }

            int media = suma / ESTATURAS_DEPORTISTAS;

            System.out.printf("| %3d %3d %3d", media, minima, maxima);

            System.out.println();
        }
    }
}