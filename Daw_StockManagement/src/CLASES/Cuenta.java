import java.util.Set;

public class Cuenta {
    private String codigo;
    private String dniResponsable;
    private Departamento dpto;
    private double saldo;
    private Set<Producto> productos;
    private Set<Transaccion> transacciones;

    public Cuenta(String codigo, String dniResponsable, Departamento dpto, double saldo, Set<Producto> productos, Set<Transaccion> transacciones) {
        this.codigo = codigo;
        this.dniResponsable = dniResponsable;
        this.dpto = dpto;
        this.saldo = saldo;
        this.productos = productos;
        this.transacciones = transacciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
}
