package EJERCICIOS;

import java.util.HashMap;
import java.util.Map;

import static FUNCIONES.FuncionCinco.generarPedido;
import static FUNCIONES.FuncionCinco.imprimirPedido;

public class EJ5 {
    public static void main(String[] args) {

        Map<String, Integer> stockPizzas = new HashMap<>();
        stockPizzas.put("Margarita", 4);
        stockPizzas.put("Pepperoni", 5);
        stockPizzas.put("Especial quesos", 2);
        stockPizzas.put("Cuatro estaciones", 3);
        stockPizzas.put("Nórdica", 0);

        Map<String, Double> preciosPizzas = new HashMap<>();
        preciosPizzas.put("Margarita", 7.95);
        preciosPizzas.put("Pepperoni", 10.25);
        preciosPizzas.put("Especial quesos", 12.5);
        preciosPizzas.put("Cuatro estaciones", 9.5);
        preciosPizzas.put("Nórdica", 11.5);

        try {
            Map<String, Double> pedido = generarPedido(stockPizzas, preciosPizzas);
            double total = imprimirPedido(pedido);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
