package LISTAS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EJ4 {
    public static void main(String[] args) {

        List<String> listaOriginal = new ArrayList<>(List.of("Mano", "Pepe", "Alejandro", "wawa"));
        List<String> listaMenorAMayor = new ArrayList<>(listaOriginal);
        List<String> listaMayorAMenor = new ArrayList<>(listaOriginal);

        Collections.sort(listaMenorAMayor);
        listaMayorAMenor.sort(Collections.reverseOrder());


        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista ordenada de menor a mayor: " + listaMenorAMayor);
        System.out.println("Lista ordenada de mayor a menor : " + listaMayorAMenor);


    }

}
