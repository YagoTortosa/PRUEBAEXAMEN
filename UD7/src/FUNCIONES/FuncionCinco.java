package FUNCIONES;

import java.util.*;

public class FuncionCinco {
    public static Map<Character, Set<String>> filtrarPorVocal (Set<String> empresas) {

        Map<Character, Set<String>> empresasPorVocal = new TreeMap<>();


        for (String empresa : empresas) {
            char primeraLetra = empresa.toLowerCase().charAt(0);

            if (empresasPorVocal.containsKey(primeraLetra)) {
                empresasPorVocal.get(primeraLetra).add(empresa);
            } else {
                Set<String> empresasConEsaLetra = new TreeSet<>();
                empresasConEsaLetra.add(empresa);
                empresasPorVocal.put(primeraLetra, empresasConEsaLetra);
            }
        }


        return empresasPorVocal;
    }
}
