package EJ1;

public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) throws StockInsuficiente {
        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }

        if (precio <= 0) {
            throw new IllegalArgumentException("El precio del producto no puede ser negativo o tener el valor 0.");
        }

        if (stock < 0) {
            throw new IllegalArgumentException("El stock del producto no puede ser numero negativo.");
        }

        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Metodos

    public void vender(int cantidad) throws StockInsuficiente {
        if (cantidad > stock) {
            throw new StockInsuficiente("No hay suficiente stock para vender la cantidad pedida.");
        }
        stock -= cantidad;
    }

    public void reponer(int cantidad) {
        if (cantidad > stock) {
            throw new IllegalArgumentException("La cantidad a reponer debe ser positiva.");
        }
        stock += cantidad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock disponible: " + stock);
    }




    // Excepciones personalizadas

    public static class StockInsuficiente extends Exception {
        public StockInsuficiente(String mensaje) {
            super(mensaje);
        }
    }



}
