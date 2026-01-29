import java.util.*;

public class EJ5 {
    public static void main(String[] args) {

        Set<String> empresas = new TreeSet<>(List.of("Uber", "Inditex", "Apple", "Ikea", "Oracle", "Iberdrola", "Endesa", "Amazon", "Adobe"));

        System.out.println("Empresas agrupadas por vocal inicial y ordenadas alfabéticamente: ");

        // Va a recorrer el mapa que devuelve la función filtrarPorVocal y lo imprime
        for (Map.Entry<Character, Set<String>> entrySet : filtrarPorVocal(empresas).entrySet()) {
            System.out.println(entrySet.getKey() + ": " + entrySet.getValue());
        }


    }


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
