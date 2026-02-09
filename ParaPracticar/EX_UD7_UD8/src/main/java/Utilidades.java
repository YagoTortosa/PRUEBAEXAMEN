import java.util.*;

public class Utilidades {

    // EJ1

    public static boolean puedeSubir(boolean problemaCardiaco, int edad, double altura) throws EdadMinimaEx, AlturaMinimaEx, ProblemaCardiacoEx {

        if (problemaCardiaco) {
            throw new ProblemaCardiacoEx("Personas con problema cardíacos no pueden subir.");
        }

        if (edad < 12) {
            throw new EdadMinimaEx("La edad mínima para subir es de 12 años.");
        }

        if (altura < 1.4) {
            throw new AlturaMinimaEx("La altura mínima para subir es de 1.5 metros.");
        }

        return true;
    }

    public static class ProblemaCardiacoEx extends Exception {
        public ProblemaCardiacoEx(String mensaje) {
            super(mensaje);
        }
    }

    public static class EdadMinimaEx extends Exception {
        public EdadMinimaEx(String mensaje) {
            super(mensaje);
        }
    }

    public static class AlturaMinimaEx extends Exception {
        public AlturaMinimaEx(String mensaje) {
            super(mensaje);
        }
    }







    // EJ2

    public static int convertirOroEnGemas(String cantidadOro) throws OroInvalidoEx {
        int oro = Integer.parseInt(cantidadOro);

        if (oro < 1 || oro > 10000) {
            throw new OroInvalidoEx("La cantidad de oro debe ser entre 1 y 10,000.");
        }

        return (oro / 100) * 3;
    }

    public static class OroInvalidoEx extends Exception {
        public OroInvalidoEx(String mensaje) {
            super(mensaje);
        }
    }






    // EJ3

    public static int calcularPuntuacion(int victorias, int empates, int derrotas) throws PartidasInvalidasEx, LimitePartidasEx {
        if (victorias < 0 || empates < 0 || derrotas < 0) {
            throw new PartidasInvalidasEx("Las victorias, empates y derrotas no pueden ser negativas.");
        }

        int partidasTotales = victorias + empates + derrotas;


        if (partidasTotales > 100) {
            throw new LimitePartidasEx("El número total de partidas no puede exceder 100.");
        }

        return (victorias * 3) + empates;
    }


    public static class PartidasInvalidasEx extends Exception {
        public PartidasInvalidasEx(String mensaje) {
            super(mensaje);
        }
    }

    public static class LimitePartidasEx extends Exception {
        public LimitePartidasEx(String mensaje) {
            super(mensaje);
        }
    }




    // EJ4

    public static String generarContraseña(int longitud, String caracteres, String caracteresEspeciales) throws LongitudInvalidaEx, ContrasenyaInvalidaEx {
        if (longitud < 8 || longitud > 16) {
            throw new LongitudInvalidaEx("La longitud de la contraseña debe ser entre 8 y 16 caracteres.");
        }

        StringBuilder contrasena = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indice = (int) (Math.random() * caracteres.length());
            contrasena.append(caracteres.charAt(indice));
        }

        if (!contrasena.append(caracteresEspeciales).toString().equals(caracteresEspeciales)) {
            throw new ContrasenyaInvalidaEx("La contraseña generada no contiene al menos un carácter de cada tipo.");
        }

        return contrasena.toString();
    }

    public static class ContrasenyaInvalidaEx extends Exception {
        public ContrasenyaInvalidaEx(String mensaje) {
            super(mensaje);
        }
    }

    public static class LongitudInvalidaEx extends Exception {
        public LongitudInvalidaEx(String mensaje) {
            super(mensaje);
        }
    }





    // EJ5


    public static Map<String, Double> generarPedido(Map<String, Integer> stockPizzas,
                                                    Map<String, Double> preciosPizzas)
            throws StockPreciosPizzasVaciosEx {

        if (stockPizzas.isEmpty() || preciosPizzas.isEmpty()) {
            throw new StockPreciosPizzasVaciosEx("Los mapas de stock o precios están vacíos.");
        }

        Random random = new Random();
        int numPizzasPedido = random.nextInt(3) + 1;

        List<String> nombresPizzas = new ArrayList<>(stockPizzas.keySet());
        Map<String, Double> pedido = new LinkedHashMap<>();

        for (int i = 0; i < numPizzasPedido; i++) {

            String pizzaSeleccionada = nombresPizzas.get(random.nextInt(nombresPizzas.size()));
            int stockActual = stockPizzas.getOrDefault(pizzaSeleccionada, 0);

            if (stockActual <= 0) {
                return new LinkedHashMap<>();
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

        System.out.println("PEDIDO GENERADO:");

        for (Map.Entry<String, Double> entrada : pedido.entrySet()) {
            System.out.println("- " + entrada.getKey() + " (" + entrada.getValue() + " €)");
            total += entrada.getValue();
        }

        System.out.println("-------------------------");
        System.out.println("TOTAL: " + total + " €");

        return total;
    }

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
}

