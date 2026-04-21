package util;
import java.sql.SQLException;

/**
 * Clase 'CargaDatos' que realiza toda la carga inicial de datos en la aplicación.
 * <ul>
 *     <li>Borrado de datos de todas las tablas</li>
 *     <li>Inserción de usuarios</li>
 *     <li>Inserción de departamentos</li>
 *     <li>Inserción de cuentas</li>
 *     <li>Inserción de transaccioes asociados a las cuentas</li>
 * </ul>
 *
 * @author Manel Navarro Pérez
 * @version 1.0
 */
public class CargaDatos {

    /**
     * Se invoca a todos los métodos de la clase CargaDatos:
     * <ul>
     *     <li>borrarDatos()</li>
     *     <li>insertarUsuario()</li>
     *     <li>insertarDepartamentos()</li>
     *     <li>insertarCuentas()</li>
     *     <li>insertarTransacciones()</li>
     * </ul>
     *
     * @throws SQLException
     */
    public static void main(String[] args) {

        try {
            //Borrado de datos almacenados en todas las tablas

            //Precarga de usuario admin

            //Precarga de departamentos

            //Precarga de cuentas

            //Precarga de movimientos
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Borrado de datos de las tablas:
     * <ul>
     *     <li>Usuario</li>
     *     <li>Departamento</li>
     *     <li>Cuenta</li>
     *     <li>Producto</li>
     *     <li>Transacción</li>
     * </ul>
     *
     * @throws SQLException
     */
    public static void borrarDatos() {
        //IMPLEMENTAR
    }

    /**
     * Inserción de usuarios en tabla 'usuario'
     * @throws SQLException
     */
    public static void insertarUsuario() {
        //IMPLEMENTAR
    }

    /**
     * Inserción de departamentos con sus correspondientes saldos iniciales en tabla 'departamento'
     * <ul>
     *     <li>MARKETING: 3.500 €</li>
     *     <li>DIRECCION 15.000 €</li>
     *     <li>INFORMATICA: 10.000 €</li>
     *     <li>RRHH: 5.000 €</li>
     * </ul>
     *
     * @throws SQLException
     */
    public static void insertarDepartamentos() {
        //IMPLEMENTAR
    }

    /**
     * Inserción de varias cuentas iniciales (una por departamento)
     * @throws SQLException
     */
    /*
    public static void insertarCuentas() throws SQLException {

        CuentaDAO ctaDAO = new CuentaDAO();

        ctaDAO.crearCuenta(new Cuenta("11111111A", "MARKETING"));
        ctaDAO.crearCuenta(new Cuenta("22222222B", "DIRECCION"));
        ctaDAO.crearCuenta(new Cuenta("33333333C", "INFORMATICA"));
        ctaDAO.crearCuenta(new Cuenta("44444444D", "RRHH"));

        System.out.println("INSERCIÓN DE CUENTAS COMPLETADA");
    }*/

    /**
     * Inserción de transacciones asociadas a cada una de las cuentas creadas
     * @throws SQLException
     */
    /*
    public static void insertarTransacciones() throws SQLException {

        CuentaDAO ctaDAO = new CuentaDAO();
        Cuenta cta1 = ctaDAO.obtenerCuenta("11111111A");
        cta1.alta(new Producto("Canon", "Cámara réflex EOS 250D", 749.00));
        cta1.alta(new Producto("Sony", "Cámara mirrorless Alpha 6400", 899.00));
        cta1.alta(new Producto("Rode", "Micrófono profesional USB", 129.99));
        cta1.alta(new Producto("Wacom", "Tableta gráfica Intuos Pro", 349.00));
        cta1.baja("Wacom");
        cta1.alta(new Producto("Adobe", "Licencia Creative Cloud 1 año", 719.00));
        cta1.alta(new Producto("Neewer", "Kit iluminación LED estudio", 159.99));
        cta1.baja("Sony");
        cta1.alta(new Producto("DJI", "Dron Mini 3 Pro", 829.00));
        cta1.baja("Rode");

        Cuenta cta2 = ctaDAO.obtenerCuenta("22222222B");
        cta2.alta(new Producto("Apple", "MacBook Pro 14'' M3", 2299.00));
        cta2.alta(new Producto("HP", "Portátil EliteBook i7 32GB RAM", 1699.00));
        cta2.alta(new Producto("Samsung", "Tablet Galaxy Tab S9", 799.00));
        cta2.baja("HP");
        cta2.alta(new Producto("Montblanc", "Bolígrafo ejecutivo Meisterstück", 420.00));
        cta2.alta(new Producto("Fellowes", "Trituradora de papel profesional", 289.00));
        cta2.baja("Apple");
        cta2.alta(new Producto("Logitech", "Sistema videoconferencia Rally", 1499.00));

        Cuenta cta3 = ctaDAO.obtenerCuenta("33333333C");
        cta3.alta(new Producto("Dell", "Servidor PowerEdge T350", 1899.00));
        cta3.alta(new Producto("Cisco", "Switch gestionable 48 puertos", 899.00));
        cta3.alta(new Producto("Synology", "NAS 8 bahías DS1821+", 999.00));
        cta3.alta(new Producto("Kingston", "SSD 2TB NVMe", 179.95));
        cta3.baja("Cisco");
        cta3.baja("Synology");
        cta3.alta(new Producto("Corsair", "Memoria RAM 64GB DDR4", 249.99));
        cta3.alta(new Producto("APC", "SAI Smart-UPS 2200VA", 699.00));
        cta3.alta(new Producto("Ubiquiti", "Punto acceso WiFi 6", 189.00));

        Cuenta cta4 = ctaDAO.obtenerCuenta("44444444D");
        cta4.alta(new Producto("Lenovo", "Portátil IdeaPad i5 16GB", 749.00));
        cta4.alta(new Producto("Brother", "Impresora multifunción láser", 249.00));
        cta4.alta(new Producto("Microsoft", "Licencia Microsoft 365 Empresa", 149.00));
        cta4.alta(new Producto("Epson", "Escáner documental WorkForce", 319.00));
        cta4.alta(new Producto("Kensington", "Lector huella biométrico USB", 89.99));
        cta4.baja("Brother");
        cta4.alta(new Producto("Fellowes", "Archivador metálico 4 cajones", 199.00));

        System.out.println("INSERCIÓN DE TRANSACCIONES COMPLETADA");
    }*/

}
