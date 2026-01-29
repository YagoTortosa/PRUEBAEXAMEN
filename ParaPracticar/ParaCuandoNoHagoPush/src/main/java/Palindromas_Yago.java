import java.util.*;

public class Palindromas_Yago {
    public static Set<String> encontrarPalindromas(List<String> palabras) {
        Set<String> palindromas = new TreeSet<>();
        for (String palabra : palabras) {
            if (esPalindroma(palabra)) {
                palindromas.add(palabra);
            }
        }
        return palindromas;
    }

    public static boolean esPalindroma(String palabra) {
        String s = palabra.toLowerCase();

        List<Character> palabras = new ArrayList<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            palabras.add(s.charAt(i));
        }

        List<Character> reversa = new ArrayList<>(palabras);

        Collections.reverse(reversa);

        return palabras.equals(reversa);
    }


    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>(List.of("reconocer", "osa", "palabra", "radar", "sometemos", "hannah", "java"));

        Set<String> palindromas = encontrarPalindromas(palabras);

        System.out.println("Lista original: " + palabras);
        System.out.println("Conjunto de palíndromas: " + palindromas);
    }
}
