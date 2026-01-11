import java.util.*;

public class EJ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        String[] fraseSeparada = frase.toLowerCase().split(" ");

        //Tengo TartamudEZ y REPITO repito mucho MucHO todas las LAS palabras

        Set<String> palabras = new TreeSet<>();
        Set<String> palabrasRepetidas = new TreeSet<>();
        Set<String> palabrasNoRepetidas = new TreeSet<>();


        for (String palabra : fraseSeparada) {
            if (!palabras.add(palabra)) {
                palabrasRepetidas.add(palabra);
            }
        }

        for (String palabra : palabras) {
            if (!palabrasRepetidas.contains(palabra)) {
                palabrasNoRepetidas.add(palabra);
            }
        }

        System.out.println("Palabras repetidas: " + palabrasRepetidas);
        System.out.println("Palabras no repetidas: " + palabrasNoRepetidas);




    }
}
