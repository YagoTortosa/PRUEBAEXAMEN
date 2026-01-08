package MAPAS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
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

        int validas = 0;
        int erroneas = 0;
        int puntos = 0;

        System.out.println("Mostraré la palabra en espanol y tendrás que traducirla al inglés.");
        for (Map.Entry<String, String> entry : palabrasTraducidas.entrySet()) {}


    }
}
