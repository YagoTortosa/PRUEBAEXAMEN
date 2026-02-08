package FUNCIONES;

public class FuncionDos {
    public static int convertirOroEnGemas(String cantidadOro) throws IllegalArgumentException {
        int oro = Integer.parseInt(cantidadOro);

        if (oro < 1 || oro > 10000) {
            throw new IllegalArgumentException("La cantidad de oro debe estar entre 1 y 10000.");
        }


        return (oro / 100) * 3;
    }
}
