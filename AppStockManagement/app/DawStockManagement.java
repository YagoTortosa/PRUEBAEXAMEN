package app;

import util.CargaDatos;

/**
 * Clase principal 'DawStockManagement' que inicia la aplicación.
 */
public class DawStockManagement {

    static final String NOMBRE_EMPRESA = "DAW STOCK MANAGEMENT";

    public static void main(String[] args) {
        try {
            AppStock empresa = new AppStock(NOMBRE_EMPRESA);

            // Precarga de datos iniciales desde BBDD
            // Descomenta la siguiente línea para resetear la BBDD
            // CargaDatos.main(args);

            if (empresa.login()) {
                empresa.menu();
            } else {
                System.out.println("Saliendo del sistema ...");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}