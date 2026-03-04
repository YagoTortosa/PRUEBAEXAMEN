public class Producto {
    private String codigo;
    private String nombre;
    private double precio;


    // CONSTRUCTOR
    public Producto(String codigo, String nombre, double precio) {
        validarCodigo(codigo);
        validarNombre(nombre);
        validarPrecio(precio);

        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    // CONSTRUCTOR COPIA

    public Producto(Producto productoCopia) {
        if (productoCopia != null) {
            this.codigo = productoCopia.codigo;
            this.nombre = productoCopia.nombre;
            this.precio = productoCopia.precio;
        }
    }


    // GETTERS Y SETTERS

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        validarCodigo(codigo);
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        validarNombre(nombre);
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        validarPrecio(precio);
        this.precio = precio;
    }


    // METODOS AUXILIARES

    private static void validarCodigo(String codigo) {
        if (codigo == null || codigo.isEmpty())
            throw new IllegalArgumentException("El codigo no puede estar vacio o ser nulo");
    }

    private static void validarNombre(String nombre) {
        if (nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("El nombre no puede estar vacio o ser nulo");
    }

    private static void validarPrecio(double precio) {
        if (precio < 0)
            throw new IllegalArgumentException("El precio no puede ser negativo");
    }
}
