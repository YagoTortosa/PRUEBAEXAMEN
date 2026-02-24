public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        if (codigo == null || codigo.isEmpty())
            throw new IllegalArgumentException("El codigo no puede estar vacio o ser nulo");
        if (nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("El nombre no puede estar vacio o ser nulo");
        if (precio < 0)
            throw new IllegalArgumentException("El precio no puede ser negativo");


        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isEmpty())
            throw new IllegalArgumentException("El codigo no puede estar vacio o ser nulo");
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("El nombre no puede estar vacio o ser nulo");
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
