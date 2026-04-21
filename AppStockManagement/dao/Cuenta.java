package dao;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class Cuenta {
    private final String codigo;
    private String dniResponsable;
    private Departamento dpto;
    private double saldo;
    private Set<Producto> productos;
    private Set<Transaccion> transacciones;


    // CONSTRUCTOR
    public Cuenta(String dniResponsable, Departamento dpto) {

        validarDNI(dniResponsable);
        validarDepartamento(dpto);

        // CORRECCIÓN: se usa setSaldo() para encapsular la asignación del saldo inicial
        switch (dpto) {
            case MARKETING  -> setSaldo(3500.0);
            case DIRECCION  -> setSaldo(15000.0);
            case INFORMATICA -> setSaldo(10000.0);
            case RRHH       -> setSaldo(5000.0);
        }

        this.dniResponsable = dniResponsable;
        this.dpto = dpto;
        this.productos = new HashSet<>();
        this.transacciones = new LinkedHashSet<>();
        this.codigo = generarCodigo();
    }


    public String getCodigo() {
        return codigo;
    }

    public String getDniResponsable() {
        return dniResponsable;
    }

    public void setDniResponsable(String dniResponsable) {
        validarDNI(dniResponsable);
        this.dniResponsable = dniResponsable;
    }

    public Departamento getDpto() {
        return dpto;
    }

    public void setDpto(Departamento dpto) {
        validarDepartamento(dpto);
        this.dpto = dpto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        validarSaldo(saldo);
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

        String nombreDpto = dpto.name();
        String dptoAbreviado = nombreDpto.substring(0, Math.min(nombreDpto.length(), 4));
        String dniFragmento = dniResponsable.substring(dniResponsable.length() - 5);

        int anyoActual = LocalDate.now().getYear();
        int mesActual = LocalDate.now().getMonthValue();

        codigoCuenta.append("CTA");
        codigoCuenta.append("-");
        codigoCuenta.append(dptoAbreviado);
        codigoCuenta.append("-");
        codigoCuenta.append(dniFragmento);
        codigoCuenta.append("-");
        codigoCuenta.append(anyoActual);
        codigoCuenta.append("-");
        codigoCuenta.append(mesActual);

        return codigoCuenta.toString();
    }

    public void alta(Producto prod) {
        validarProducto(prod);
        validarCodigo(prod.getCodigo());

        if (saldo < prod.getPrecio()) {
            throw new IllegalArgumentException("Saldo insuficiente para comprar " + prod.getNombre());
        }

        productos.add(prod);
        // CORRECCIÓN: se usa setSaldo() para encapsular la modificación del saldo
        setSaldo(saldo - prod.getPrecio());
        transacciones.add(new Transaccion(transacciones.size(), "Alta " + prod.getNombre(), -prod.getPrecio(), saldo));
    }

    public void baja(String cod) {
        validarCodigo(cod);

        Producto productoAEliminar = null;

        for (Producto prod : productos) {
            if (prod.getCodigo().equals(cod)) {
                productoAEliminar = prod;
                break;
            }
        }

        if (productoAEliminar != null) {
            // CORRECCIÓN: se usa setSaldo() para encapsular la modificación del saldo
            setSaldo(saldo + productoAEliminar.getPrecio());
            productos.remove(productoAEliminar);
            transacciones.add(new Transaccion(transacciones.size(), "Baja " + productoAEliminar.getNombre(), productoAEliminar.getPrecio(), saldo));
        }
    }

    public void imprimirProductos() {
        System.out.println("Productos asociados a la cuenta " + codigo + ":");
        for (Producto prod : productos) {
            System.out.println("\t" + "->" + prod.getCodigo() + " / " + prod.getNombre());
        }
        System.out.println("------------------------");
        System.out.println();
    }

    public void imprimirDatosCuenta() {
        System.out.println("Código/Responsable: " + codigo + " / " + dniResponsable);
        System.out.println("Saldo del departamento de " + dpto + ": " + saldo);
        System.out.println("Fecha de consulta: " + LocalDate.now());
        if (productos == null || productos.isEmpty())
            System.out.println("La cuenta no tiene productos dados de alta.");
    }

    // METODOS AUXILIARES

    public static void validarDNI(String dniResponsable) {
        if (dniResponsable == null || dniResponsable.isEmpty()) {
            throw new IllegalArgumentException("El DNI del responsable no es válido. Debe tener 8 dígitos seguidos de una letra.\nEl código de cuenta no puede ser nulo o estar vacío.");
        }

        final String patronDNI = "^\\d{8}[A-Z]$";
        if (!dniResponsable.matches(patronDNI))
            throw new IllegalArgumentException("DNI inválido! Debe tener 8 dígitos seguidos de una letra.");
    }


    public static void validarCodigo(String codigo) {
        if (codigo == null || codigo.isEmpty())
            throw new IllegalArgumentException("El codigo no debe estar vacío");
    }

    static void validarSaldo(double saldo) {
        if (saldo < 0)
            throw new IllegalArgumentException("El saldo no puede ser negativo");
    }

    static void validarDepartamento(Departamento dpto) {
        if (dpto == null)
            throw new IllegalArgumentException("El departamento no puede ser nulo.");
    }

    static void validarProducto(Producto prod) {
        if (prod == null)
            throw new IllegalArgumentException("El producto no puede ser nulo");
    }
}