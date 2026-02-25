import java.util.Set;

public class Cuenta {
    private final String codigo;
    private String dniResponsable;
    private Departamento dpto;
    private double saldo;
    private Set<Producto> productos;
    private Set<Transaccion> transacciones;

    public Cuenta(String codigo, String dniResponsable, Departamento dpto, double saldo, Set<Producto> productos, Set<Transaccion> transacciones) {
        if (codigo == null || codigo.isEmpty())
            throw new IllegalArgumentException("El código de la cuenta no puede ser nulo o vacío.");

        if (dniResponsable == null || dniResponsable.isEmpty()) // QUEDA VALIDAR EL FORMATO DEL DNI
            throw new IllegalArgumentException("El DNI del responsable no es válido. Debe tener 8 dígitos seguidos de una letra.");

         if (dpto == null)
            throw new IllegalArgumentException("El departamento no puede ser nulo.");

         if (saldo < 0)
            throw new IllegalArgumentException("El saldo no puede ser negativo.");
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

    public String generarCodigo(String dniResponsable, Departamento dpto) {
        StringBuilder codigoCuenta = new StringBuilder();
        codigoCuenta.append("CTA");
        codigoCuenta.append("-");

        return dniResponsable;
    }

}
