public class DawStockManagement {

    static final String NOMBRE_EMPRESA = "DAW STOCK MANAGEMENT";

    public static void main(String[] args) {



        try {
            App empresa = new App(NOMBRE_EMPRESA);

            //Precarga de datos almacenados
            CargarDatos.precargaDatos(empresa);

            if(empresa.login()) // Devuelve True si el login es correcto
                empresa.menu();
            else
                System.out.println("Saliendo del sistema ...");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
