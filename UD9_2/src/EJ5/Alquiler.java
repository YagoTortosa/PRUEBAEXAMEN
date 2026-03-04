package EJ5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Alquiler {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precioPorDia;

    public Alquiler(Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio, LocalDate fechaFin, double precioPorDia) {

        validarFechaInicio(fechaInicio);
        validarFechaFin(fechaFin);

        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioPorDia = precioPorDia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }


    // METODOS

    private void validarFechaInicio(LocalDate fechaInicio) {
        if (fechaInicio == null || fechaFin.isBefore(fechaInicio))
            throw new IllegalArgumentException("Fecha Inicio no puede ser anterior a la actual");
    }

    private void validarFechaFin(LocalDate fechaFin) {
        if (fechaFin == null || fechaInicio.isAfter(fechaFin))
            throw new IllegalArgumentException("Fecha Fin debe ser posterior a la fecha de inicio.");
    }

    public double calcularCosteTotal(double precioPorDia) {
        long diasDeAlquiler = ChronoUnit.DAYS.between(fechaInicio, fechaFin);

        return diasDeAlquiler * precioPorDia;
    }


}
