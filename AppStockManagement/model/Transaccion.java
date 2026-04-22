package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase que representa una transacción del sistema.
 * Cambios en UD13:
 * - Tipo de dato de fecha: String -> LocalDateTime
 * - Eliminado atributo id (viene del serial autoincremental de BBDD)
 * - Dos constructores: uno para crear nueva transacción, otro para recuperar de BBDD
 */
public class Transaccion {

    private String concepto;
    private double importe;
    private double saldoActual;
    private LocalDateTime fecha;

    /**
     * Constructor para crear una nueva transacción (sin fecha parámetro).
     */
    public Transaccion(String concepto, double importe, double saldoActual) {
        this.concepto = concepto;
        this.importe = importe;
        this.saldoActual = saldoActual;
        this.fecha = LocalDateTime.now();
    }

    /**
     * Constructor para recuperar una transacción desde BBDD (con fecha parámetro).
     */
    public Transaccion(String concepto, double importe, double saldoActual, LocalDateTime fecha) {
        this.concepto = concepto;
        this.importe = importe;
        this.saldoActual = saldoActual;
        this.fecha = fecha;
    }

    // GETTERS

    public String getConcepto() {
        return concepto;
    }

    public double getImporte() {
        return importe;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * Imprime la transacción con formato de fecha y hora.
     */
    public void imprimirTransaccion() {
        String p1 = concepto;

        String p2;
        if (importe > 0)
            p2 = "| +" + importe + " €";
        else
            p2 = "| " + importe + " €";

        String p3 = "| Saldo: " + saldoActual;

        // Formato de fecha con hora
        String fechaFormato = fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm"));
        String p4 = "| " + fechaFormato;

        System.out.println(p1 + " ".repeat(40 - p1.length()) +
                p2 + " ".repeat(20 - p2.length()) +
                p3 + " ".repeat(20 - p3.length()) +
                p4 + " ".repeat(12 - p4.length())
        );
    }
}