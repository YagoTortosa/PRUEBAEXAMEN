/**
 * Clase que crea datos de prueba
 * - Crea 4 clientes y crea una cuenta bancaria asociándola a cada cliente
 * - Añade los clientes en la lista de clientes
 * - Añade las cuentas bancarias a la lista de cuentas
 * - Crea movimientos (conjunto) de ingreso y retirada asociados a las cuentas bancarias
 */
public class CargarDatos {

    public static void precargaDatos(AppStock empresa){

        Cuenta cta1 = new Cuenta("11111111A", DepartamentoEnum.MARKETING);
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
        empresa.getCuentas().add(cta1);

        Cuenta cta2 = new Cuenta("22222222B", DepartamentoEnum.DIRECCION);
        cta2.alta(new Producto("Apple", "MacBook Pro 14'' M3", 2299.00));
        cta2.alta(new Producto("HP", "Portátil EliteBook i7 32GB RAM", 1699.00));
        cta2.alta(new Producto("Samsung", "Tablet Galaxy Tab S9", 799.00));
        cta2.baja("HP");
        cta2.alta(new Producto("Montblanc", "Bolígrafo ejecutivo Meisterstück", 420.00));
        cta2.alta(new Producto("Fellowes", "Trituradora de papel profesional", 289.00));
        cta2.baja("Apple");
        cta2.alta(new Producto("Logitech", "Sistema videoconferencia Rally", 1499.00));
        empresa.getCuentas().add(cta2);

        Cuenta cta3 = new Cuenta("33333333C", DepartamentoEnum.INFORMATICA);
        cta3.alta(new Producto("Dell", "Servidor PowerEdge T350", 1899.00));
        cta3.alta(new Producto("Cisco", "Switch gestionable 48 puertos", 899.00));
        cta3.alta(new Producto("Synology", "NAS 8 bahías DS1821+", 999.00));
        cta3.alta(new Producto("Kingston", "SSD 2TB NVMe", 179.95));
        cta3.baja("Cisco");
        cta3.baja("Synology");
        cta3.alta(new Producto("Corsair", "Memoria RAM 64GB DDR4", 249.99));
        cta3.alta(new Producto("APC", "SAI Smart-UPS 2200VA", 699.00));
        cta3.alta(new Producto("Ubiquiti", "Punto acceso WiFi 6", 189.00));
        empresa.getCuentas().add(cta3);

        Cuenta cta4 = new Cuenta("44444444D", DepartamentoEnum.RRHH);
        cta4.alta(new Producto("Lenovo", "Portátil IdeaPad i5 16GB", 749.00));
        cta4.alta(new Producto("Brother", "Impresora multifunción láser", 249.00));
        cta4.alta(new Producto("Microsoft", "Licencia Microsoft 365 Empresa", 149.00));
        cta4.alta(new Producto("Epson", "Escáner documental WorkForce", 319.00));
        cta4.alta(new Producto("Kensington", "Lector huella biométrico USB", 89.99));
        cta4.baja("Brother");
        cta4.alta(new Producto("Fellowes", "Archivador metálico 4 cajones", 199.00));
        empresa.getCuentas().add(cta4);
    }
}
