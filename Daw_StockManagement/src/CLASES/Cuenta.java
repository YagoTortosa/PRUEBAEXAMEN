import java.time.LocalDate;
import java.util.Set;

public class Cuenta {
    private String codigo;
    private String dniResponsable;
    private Departamento dpto;
    private double saldo;
    private Set<Producto> productos;
    private Set<Transaccion> transacciones;


    // CONSTRUCTOR
    public Cuenta(String dniResponsable, Departamento dpto) {

        if (dpto == null || dpto.name().isEmpty())
            throw new IllegalArgumentException("El departamento no puede ser nulo o estar vacio.");

        switch (dpto) {
            case MARKETING -> this.saldo = 3500.0;
            case DIRECCION -> this.saldo = 15000.0;
            case INFORMATICA -> this.saldo = 10000.0;
            case RRHH -> this.saldo = 5000.0;
        }

        if (dniResponsable == null || dniResponsable.isEmpty()) // QUEDA VALIDAR EL FORMATO DEL DNI
            throw new IllegalArgumentException("El DNI del responsable no es válido. Debe tener 8 dígitos seguidos de una letra.");

        this.dniResponsable = dniResponsable;
        this.dpto = dpto;
    }


    public String getCodigo() {
        return codigo;
    }

    public String getDniResponsable() {
        return dniResponsable;
    }

    public void setDniResponsable(String dniResponsable) {
        this.dniResponsable = dniResponsable;
    }

    public Departamento getDpto() {
        return dpto;
    }

    public void setDpto(Departamento dpto) {
        this.dpto = dpto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }

    public Set<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Set<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    // METODOS

    private String generarCodigo() {

        StringBuilder codigoCuenta = new StringBuilder();
        final String dptoAbreviado = dpto.name().substring(0, 4).toUpperCase();
        int anyoActual = LocalDate.now().getYear();
        int mesActual = LocalDate.now().getMonthValue();

        codigoCuenta.append("CTA");
        codigoCuenta.append("-");
        codigoCuenta.append(dptoAbreviado);
        codigoCuenta.append("-");
        codigoCuenta.append(dniResponsable, 4, 10);
        codigoCuenta.append("-");
        codigoCuenta.append(anyoActual);
        codigoCuenta.append("-");
        codigoCuenta.append(mesActual);

        return codigoCuenta.toString();
    }

    public void alta(Producto prod) {
        if (prod.getCodigo() == null || prod.getCodigo().isEmpty())
            throw new IllegalArgumentException("El producto no puede ser nulo.");

        if (saldo < prod.getPrecio())
            throw new IllegalStateException("No hay suficiente saldo para realizar la compra.");

        productos.add(prod);
        saldo -= prod.getPrecio();
    }

    public void baja(String cod) {
        if (cod == null || cod.isEmpty())
            throw new IllegalArgumentException("El codigo no puede ser nulo o estar vacio.");

        Producto productoAEliminar = null;

        for (Producto prod : productos) {
            if (prod.getCodigo().equals(cod)) {
                productoAEliminar = prod;
                saldo += productoAEliminar.getPrecio();
                break;
            }
        }

        productos.remove(productoAEliminar);
    }



}
