package LISTAS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EJ3 {
    public static void main(String[] args) {

        List<Integer> listaOriginal = new ArrayList<>(List.of(15, 10, 25, 33, 10, 15, 18, 19, 14, 17));
        List<Integer> listaMenorAMayor = new ArrayList<>(listaOriginal);
        List<Integer> listaMayorAMenor = new ArrayList<>(listaOriginal);

        Collections.sort(listaMenorAMayor);
        listaMayorAMenor.sort(Collections.reverseOrder());


        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista ordenada de menor a mayor: " + listaMenorAMayor);
        System.out.println("Lista ordenada de mayor a menor : " + listaMayorAMenor);









    }
}
