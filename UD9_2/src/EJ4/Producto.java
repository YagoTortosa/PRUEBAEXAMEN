package EJ4;

public class Producto {
    private String idProducto;
    private String nombre;
    private double precio;

    public Producto(String idProducto, String nombre, double precio) {
        if (nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("El nombre no puede ser nulo o estar vacío");

        if (precio < 0)
            throw new IllegalArgumentException("El precio no puede ser negativo");

        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("El nombre no puede ser nulo o estar vacío");

        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0)
            throw new IllegalArgumentException("El precio no puede ser negativo");
        this.precio = precio;
    }
}
