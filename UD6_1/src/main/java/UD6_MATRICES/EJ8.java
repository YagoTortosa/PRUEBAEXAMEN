package UD6_MATRICES;

public class EJ8 {
    public static void main(String[] args) {

        final String[] PAISES = new String[] {"España", "Alemania", "Francia", "Italia"};

        final int ESTATURAMINIMA = 140;
        final int ESTATURAMAXIMA = 210;


        PAISES[0] = String.valueOf(Math.random() * ESTATURAMAXIMA) + ESTATURAMINIMA;
        PAISES[1] = String.valueOf(Math.random() * ESTATURAMAXIMA) + ESTATURAMINIMA;
        PAISES[2] = String.valueOf(Math.random() * ESTATURAMAXIMA) + ESTATURAMINIMA;
        PAISES[3] = String.valueOf(Math.random() * ESTATURAMAXIMA) + ESTATURAMINIMA;

    }
}
