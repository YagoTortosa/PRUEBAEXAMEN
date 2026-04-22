package model;

/**
 * Clase que representa un producto del sistema.
 * No tiene setters inversibles para mantener la integridad de datos.
 */
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    /**
     * Constructor para crear un nuevo producto.
     */
    public Producto(String codigo, String nombre, double precio) {
        validarCodigo(codigo);
        validarNombre(nombre);
        validarPrecio(precio);

        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Constructor de copia.
     */
    public Producto(Producto productoCopia) {
        if (productoCopia != null) {
            this.codigo = productoCopia.codigo;
            this.nombre = productoCopia.nombre;
            this.precio = productoCopia.precio;
        }
    }

    // GETTERS (Sin setters inversibles como indica el PDF)

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // MÉTODOS AUXILIARES

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