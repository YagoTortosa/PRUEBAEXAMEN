package EJERCICIOS;

import java.util.*;

import static FUNCIONES.FuncionCinco.filtrarPorVocal;


public class EJ5 {
    public static void main(String[] args) {

        Set<String> empresas = new TreeSet<>(List.of("Uber", "Inditex", "Apple", "Ikea", "Oracle", "Iberdrola", "Endesa", "Amazon", "Adobe"));

        System.out.println("Empresas agrupadas por vocal inicial y ordenadas alfabéticamente: ");

        // Va a recorrer el mapa que devuelve la función filtrarPorVocal y lo imprime
        for (Map.Entry<Character, Set<String>> entrySet : filtrarPorVocal(empresas).entrySet()) {
            System.out.println(entrySet.getKey() + ": " + entrySet.getValue());
        }


    }
}
