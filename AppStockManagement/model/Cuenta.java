package model;

import dao.*;
import java.time.LocalDate;
import java.util.*;

/**
 * Clase que representa una cuenta del sistema.
 * Cambios en UD13:
 * - Departamento: enum -> String (validado contra BBDD)
 * - Saldo inicial desde DAO en constructor
 * - Nuevo constructor que recupera cuenta completa de BBDD
 * - Métodos alta/baja usan DAO
 */
public class Cuenta {
    private final String codigo;
    private String dniResponsable;
    private String dpto;
    private double saldo;
    private Set<Producto> productos;
    private Set<Transaccion> transacciones;

    /**
     * Constructor para crear una nueva cuenta.
     * El saldo inicial se obtiene del departamento desde BBDD.
     */
    public Cuenta(String dniResponsable, String dpto) {
        validarDNI(dniResponsable);
        validarDepartamento(dpto);

        this.dniResponsable = dniResponsable;
        this.dpto = dpto;

        // Obtener saldo inicial desde DAO
        try {
            this.saldo = CuentaDAO.obtenerSaldoInicial(dpto);
        } catch (Exception e) {
            throw new IllegalArgumentException("Error al obtener saldo inicial: " + e.getMessage());
        }

        this.productos = new HashSet<>();
        this.transacciones = new LinkedHashSet<>();
        this.codigo = generarCodigo();
    }

    /**
     * Constructor parametrizado para recuperar una cuenta completa desde BBDD.
     * Asigna todos los datos: código, saldo, productos y transacciones.
     */
    public Cuenta(String codigo, String dniResponsable, String dpto, double saldo,
                  Set<Producto> productos, Set<Transaccion> transacciones) {
        this.codigo = codigo;
        this.dniResponsable = dniResponsable;
        this.dpto = dpto;
        this.saldo = saldo;
        this.productos = productos != null ? productos : new HashSet<>();
        this.transacciones = transacciones != null ? transacciones : new LinkedHashSet<>();
    }

    // GETTERS Y SETTERS

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

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
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

    // MÉTODOS

    private String generarCodigo() {
        StringBuilder codigoCuenta = new StringBuilder();

        String dptoAbreviado = dpto.substring(0, Math.min(dpto.length(), 4));
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

    /**
     * Da de alta un producto en la cuenta (inserta en BBDD y crea transacción).
     */
    public void alta(Producto prod) {
        validarProducto(prod);
        validarCodigo(prod.getCodigo());

        if (saldo < prod.getPrecio()) {
            throw new IllegalArgumentException("Saldo insuficiente para comprar " + prod.getNombre());
        }

        try {
            // Insertar producto en BBDD
            ProductoDAO.insertarProducto(prod, codigo);

            // Actualizar saldo localmente
            setSaldo(saldo - prod.getPrecio());

            // Actualizar saldo en BBDD
            CuentaDAO.actualizarSaldo(codigo, saldo);

            // Crear transacción
            Transaccion transaccion = new Transaccion("Alta " + prod.getNombre(), -prod.getPrecio(), saldo);
            TransaccionDAO.insertarTransaccion(transaccion, codigo);
            transacciones.add(transaccion);

            productos.add(prod);
        } catch (Exception e) {
            throw new IllegalArgumentException("Error al dar de alta producto: " + e.getMessage());
        }
    }

    /**
     * Da de baja un producto en la cuenta (elimina de BBDD y crea transacción).
     */
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
            try {
                // Eliminar producto de BBDD
                ProductoDAO.borrarProducto(productoAEliminar, codigo);

                // Actualizar saldo localmente
                setSaldo(saldo + productoAEliminar.getPrecio());

                // Actualizar saldo en BBDD
                CuentaDAO.actualizarSaldo(codigo, saldo);

                // Crear transacción
                Transaccion transaccion = new Transaccion("Baja " + productoAEliminar.getNombre(),
                        productoAEliminar.getPrecio(), saldo);
                TransaccionDAO.insertarTransaccion(transaccion, codigo);
                transacciones.add(transaccion);

                productos.remove(productoAEliminar);
            } catch (Exception e) {
                throw new IllegalArgumentException("Error al dar de baja producto: " + e.getMessage());
            }
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

    // MÉTODOS AUXILIARES

    public static void validarDNI(String dniResponsable) {
        if (dniResponsable == null || dniResponsable.isEmpty()) {
            throw new IllegalArgumentException("El DNI del responsable no es válido. Debe tener 8 dígitos seguidos de una letra.");
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

    public static void validarDepartamento(String dpto) {
        if (dpto == null || dpto.isEmpty())
            throw new IllegalArgumentException("El departamento no puede ser nulo o vacío");

        // Validar contra BBDD
        try {
            if (!DepartamentoDAO.validarDepartamento(dpto)) {
                throw new IllegalArgumentException("El departamento " + dpto + " no existe en BBDD");
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Error validando departamento: " + e.getMessage());
        }
    }

    static void validarProducto(Producto prod) {
        if (prod == null)
            throw new IllegalArgumentException("El producto no puede ser nulo");
    }
}