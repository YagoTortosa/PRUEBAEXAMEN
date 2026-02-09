package MAINS;

import java.util.LinkedHashMap;
import java.util.Map;

import static FUNCIONES.FuncionSiete.validarInventario;

public class EJ7 {
    public static void main(String[] args) {

        // Map.of crea el mapa validando al mismo tiempo que se añaden.

        Map<String, Integer> stockProductosUno = new LinkedHashMap<>();

        // Añadiendolo con put permite claves repetidas y reemplaza el valor actualizandolo.

        stockProductosUno.put("SSD", 50);
        stockProductosUno.put("Tarjeta gráfica", -10);
        stockProductosUno.put("Memoria RAM", 30);
        stockProductosUno.put("Pantalla", 101);
        stockProductosUno.put("", 15);
        stockProductosUno.put("Procesador", 0);


        Map<String, Integer> stockProductosDos = new LinkedHashMap<>();

        stockProductosDos.put("SSD", -50);
        stockProductosDos.put("Tarjeta gráfica", 10);
        stockProductosDos.put("Memoria RAM", 101);
        stockProductosDos.put("", 100);
        stockProductosDos.put("", -5);
        stockProductosDos.put("", 101);
        stockProductosDos.put("Procesador", 15);


        System.out.println("El inventario contiene los siguientes errores:");

        for (String error : validarInventario(stockProductosUno)) {
            System.out.println(error);
        }

        System.out.println("\nEl inventario contiene los siguientes errores:");


        for (String error : validarInventario(stockProductosDos)) {
            System.out.println(error);
        }




    }
}
