package FUNCIONES;

public class FuncionTres {

    public static class LimitePartidasEx extends Exception {
        public LimitePartidasEx(String mensaje) {
            super(mensaje);
        }
    }



    public static int calcularPuntuacion(int victorias, int empates ,int derrotas) throws LimitePartidasEx {

        if (victorias < 0 || empates < 0 || derrotas < 0) {
            throw new IllegalArgumentException("El número de victorias, empates o derrotas no puede ser negativo.");
        }

        int totalPartidas = victorias + empates + derrotas;


        if (totalPartidas > 100) {
            throw new LimitePartidasEx("El número total de partidas no puede exceder las 100.");
        }

        int puntuacion = (victorias * 3) + empates;

        return puntuacion;
    }
}
