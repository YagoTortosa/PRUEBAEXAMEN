package MAPAS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EJ5 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String,String> palabrasTraducidas = new HashMap<>();
        palabrasTraducidas.put("izquierda","left");
        palabrasTraducidas.put("derecha","right");
        palabrasTraducidas.put("escudo","shield");
        palabrasTraducidas.put("manzana","apple");
        palabrasTraducidas.put("motosierra","chainsaw");
        palabrasTraducidas.put("numero","number");
        palabrasTraducidas.put("pregunta","question");
        palabrasTraducidas.put("futbol","football");
        palabrasTraducidas.put("mano","hand");
        palabrasTraducidas.put("sombrero","hat");
        palabrasTraducidas.put("rizado","curly");
        palabrasTraducidas.put("piscina","pool");

        String palabra;

        do {
            System.out.print("Introduce una palabra en español: ");
            palabra = sc.nextLine();

            if (palabrasTraducidas.get(palabra.toLowerCase()) != null) { //
                System.out.println(palabra + " en ingles es " + palabrasTraducidas.get(palabra));
            } else {
                System.out.println("Lo siento, no conozco esa palabra.");
            }

        } while (palabra.isEmpty());


    }
}
