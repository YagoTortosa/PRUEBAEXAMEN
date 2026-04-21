package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaccion {

    // ATRIBUTOS DE LA CLASE
    private int id;
    private String concepto;
    private double importe;
    private double saldoActual;
    private String fecha;

    // CONSTRUCTORES
    public Transaccion(int idTransaccion, String concepto, double importe, double saldoActual) {
        this.id = idTransaccion;
        this.concepto = concepto;
        this.importe = importe; // Si es ingreso llega positivo, sino, negativo
        this.saldoActual = saldoActual;
        this.fecha = LocalDate.now().format((DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }

    // GETTERS Y SETTERS
    public int getId() {
        return id;
    }
    public String getConcepto() {
        return concepto;
    }
    public double getImporte() {
        return importe;
    }
    public double getSaldoActual() {
        return saldoActual;
    }
    public String getFecha() {
        return fecha;
    }

    // MÉTODOS
    public void imprimirTransaccion() {
        String p1 = id + "# " + concepto;

        String p2;
        if (importe > 0)
            p2 = "| +" + importe + " €";
        else
            p2 = "| " + importe + " €"; //Si el importe es negativo no es necesario signo porque ya lo trae

        String p3 = "| Saldo: " + saldoActual;
        String p4 = "| " + fecha;

        System.out.println(p1 + " ".repeat(40 - p1.length()) +
                           p2 + " ".repeat(20 - p2.length()) +
                           p3 + " ".repeat(20 - p3.length()) +
                           p4 + " ".repeat(12 - p4.length())
        );
    }

}
