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


        int puntos = 0;

        System.out.println("Mostraré la palabra en espanol y tendrás que traducirla al inglés.");

        for (Map.Entry<String, String> palabras : palabrasTraducidas.entrySet()) {

            System.out.print(palabras.getKey() + ": ");
            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase(palabras.getValue())) {
                System.out.println("¡Correcto!");
                puntos++;
            } else {
                System.out.println("Respuesta incorrecto :(\nLa traducción correcta es: " + palabras.getValue());
            }
        }





        System.out.println("Has obtenido " + puntos + " puntos.");


    }
}
