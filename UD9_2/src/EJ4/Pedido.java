package EJ4;

import java.time.*;
import java.util.*;

public class Pedido {
    private int idPedido;
    private String idCliente;
    private List<Producto> productos;
    private Estado estado;
    private LocalDate fechaPedido;
    private LocalDate fechaEntrega;


    public Pedido(int idPedido, String idCliente, List<Producto> productos, Estado estado, LocalDate fechaPedido, LocalDate fechaEntrega) {
        if (idPedido < 0)
            throw new IllegalArgumentException("El pedido no puede ser negativo");

        if (idCliente == null || idCliente.isEmpty())
            throw new IllegalArgumentException("El cliente no puede ser nulo o estar vacío");

        if (productos == null || productos.isEmpty())
            throw new IllegalArgumentException("La lista de productos no puede ser nula o estar vacía");

        if (fechaEntrega.isBefore(fechaPedido))
            throw new IllegalArgumentException("La fecha de entrega debe ser posterior a la del pedido");

        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.productos = new ArrayList<>();
        this.estado = Estado.PENDIENTE;
        this.fechaPedido = LocalDate.now();
        this.fechaEntrega = fechaEntrega;

    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        if (idPedido < 0)
            throw new IllegalArgumentException("El pedido no puede ser negativo");
        this.idPedido = idPedido;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        if (idCliente == null || idCliente.isEmpty())
            throw new IllegalArgumentException("El cliente no puede ser nulo o estar vacío");
        this.idCliente = idCliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        if (productos == null || productos.isEmpty())
            throw new IllegalArgumentException("La lista de productos no puede ser nula o estar vacía");
        this.productos = productos;
    }


    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        if (fechaEntrega.isBefore(fechaPedido))
            throw new IllegalArgumentException("La fecha de entrega debe ser posterior a la del pedido");
        this.fechaEntrega = fechaEntrega;
    }

    // METODOS

    public void validarIdCliente(String idCliente) {
        String formato = "^CLI" + LocalDate.now().getYear() + "[A-Z]{2,4}$";
        if (!idCliente.matches(formato))
            throw new IllegalArgumentException("Formato incorrecto");
    }

    public void anyadirProducto(Producto prod) {
        productos.add(prod);
    }

    public void eliminarProducto(String idProducto) {
        productos.removeIf(prod -> prod.getIdProducto().equals(idProducto));
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto prod : productos) {
            total += prod.getPrecio();
        }
        return total;
    }






}
