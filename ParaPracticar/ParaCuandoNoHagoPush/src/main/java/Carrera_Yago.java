import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Carrera_Yago {


    public static void validarTiempo(double tiempo) throws TiempoInvalidoEx {
        if (tiempo <= 0) {
            throw new TiempoInvalidoEx("El tiempo no puede ser negativo.");
        }

        if (tiempo < 30 || tiempo > 120) {
            throw new TiempoInvalidoEx("El tiempo debe estar entre 30 segundos y 2 minutos.");
        }



    }


    public static void validarDorsal(String dorsal) throws DorsalInvalidoEx {
        if (dorsal == null || dorsal.trim().isEmpty()) {
            throw new DorsalInvalidoEx("Dorsal inválido: " + dorsal);
        }

        if (!dorsal.matches("^[A-Z]-\\d{3}")) {
            throw new DorsalInvalidoEx("El dorsal debe contener una letra mayúscula, acompañada de un guión y tres valores numéricos.");
        }
    }


    public static Map<String, Double> obtenerCorredoresRapidos(Double record, Map<String, Double> participantes) throws TiempoInvalidoEx, DorsalInvalidoEx {

        Map<String, Double> ordenado = new TreeMap<>();

        for (Map.Entry<String, Double> entry : participantes.entrySet()) {
             validarDorsal(entry.getKey());
             validarTiempo(entry.getValue());

             if (entry.getValue() < record) {
                 ordenado.put(entry.getKey(), entry.getValue());
             }
        }


        return ordenado;
    }

    public static double calcularMedia(Map<String, Double> participantes) throws TiempoInvalidoEx {
        double suma = 0;
        int contador = 0;

        for (Map.Entry<String, Double> entry : participantes.entrySet()) {
            validarTiempo(entry.getValue());
            suma += entry.getValue();
            contador++;
        }

        if (contador == 0) {
            throw new TiempoInvalidoEx("No hay participantes para calcular la media.");
        }

        return suma / contador;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> participantes = new HashMap<>();
        participantes.put("C-101", 58.47);
        participantes.put("N-225 ", 62.88);
        participantes.put("C-340", 65.0);
        participantes.put("P-175", 75.56);
        participantes.put("Z-067", 54.0);

        try {
            double record = 60.0;
            Map<String, Double> corredoresRapidos = obtenerCorredoresRapidos(record, participantes);
            System.out.println("Corredores rápidos:");
            for (Map.Entry<String, Double> entry : corredoresRapidos.entrySet()) {
                System.out.println("Dorsal: " + entry.getKey() + ", Tiempo: " + entry.getValue());
            }

            double media = calcularMedia(participantes);
            System.out.println("Tiempo medio de los participantes: " + media);
        } catch (TiempoInvalidoEx | DorsalInvalidoEx e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

}
