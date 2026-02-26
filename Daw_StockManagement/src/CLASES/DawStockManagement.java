import static Practicas.P4_AppStockManagement.CargarDatos.precargaDatos;

public class DawStockManagement {

    static final String NOMBRE_EMPRESA = "DAW STOCK MANAGEMENT";

    public static void main(String[] args) {

        try {
            AppStock empresa = new AppStock(NOMBRE_EMPRESA);

            //Precarga de datos almacenados
            precargaDatos(empresa);

            if(empresa.login()) // Devuelve True si el login es correcto
                empresa.menuSeleccionarOpcion();
            else
                System.out.println("Saliendo del sistema ...");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
