package FUNCIONES;
import java.util.*;

public class FuncionCinco {
    public static class StockPreciosPizzasVaciosEx extends Exception {
        public StockPreciosPizzasVaciosEx(String mensaje) {
            super(mensaje);
        }
    }

    public static class PedidoVacioEx extends Exception {
        public PedidoVacioEx(String mensaje) {
            super(mensaje);
        }
    }


    public static Map<String, Double> generarPedido(
            Map<String, Integer> stockPizzas,
            Map<String, Double> preciosPizzas)
            throws StockPreciosPizzasVaciosEx {

        if (stockPizzas == null || preciosPizzas == null ||
                stockPizzas.isEmpty() || preciosPizzas.isEmpty()) {
            throw new StockPreciosPizzasVaciosEx("Los mapas de stock o precios están vacíos.");
        }

        Random random = new Random();
        int numPizzasPedido = random.nextInt(3) + 1; // Entre 1 y 3

        List<String> nombresPizzas = new ArrayList<>(stockPizzas.keySet());
        Map<String, Double> pedido = new LinkedHashMap<>();

        for (int i = 0; i < numPizzasPedido; i++) {

            String pizzaSeleccionada = nombresPizzas.get(random.nextInt(nombresPizzas.size()));
            int stockActual = stockPizzas.getOrDefault(pizzaSeleccionada, 0);

            if (stockActual <= 0) {
                return new HashMap<>();
            }


            stockPizzas.put(pizzaSeleccionada, stockActual - 1);

            pedido.put(pizzaSeleccionada, preciosPizzas.get(pizzaSeleccionada));
        }

        return pedido;
    }


    public static double imprimirPedido(Map<String, Double> pedido)
            throws PedidoVacioEx {

        if (pedido == null || pedido.isEmpty()) {
            throw new PedidoVacioEx("El pedido está vacío. No se puede imprimir.");
        }

        double total = 0;

        for (Map.Entry<String, Double> entrada : pedido.entrySet()) {
            System.out.println(entrada.getKey() + " (" + entrada.getValue() + " €)");
            total += entrada.getValue();
        }

        System.out.println("TOTAL: " + total + " €");

        return total;
    }
}





