package FUNCIONES;

import java.util.List;

public class FuncionUno {
    public static List<Integer> reorganizarPorMultiplos(List<Integer> numeros, int divisor) {

        List<Integer> multiplos = new java.util.ArrayList<>();
        List<Integer> noMultiplos = new java.util.ArrayList<>();

        for (Integer numero : numeros) {
            if (numero % divisor == 0) {
                multiplos.add(numero);
            } else {
                noMultiplos.add(numero);
            }
        }

        multiplos.addAll(noMultiplos);

        return multiplos;
    }
}
