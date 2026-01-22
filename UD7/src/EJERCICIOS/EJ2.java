package EJERCICIOS;

import java.util.*;

import static FUNCIONES.FuncionCinco.filtrarPorVocal;


public class EJ2 {
    public static void main(String[] args) {

        Set<String> empresas = new TreeSet<>(List.of("Uber", "Inditex", "Apple", "Ikea", "Oracle", "Iberdrola", "Endesa", "Amazon", "Adobe"));

        System.out.println("Empresas agrupadas por vocal inicial y ordenadas alfabéticamente: ");

        System.out.println(filtrarPorVocal(empresas));



    }
}
