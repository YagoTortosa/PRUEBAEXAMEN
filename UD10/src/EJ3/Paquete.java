package EJ3;

import java.time.LocalDate;

public class Paquete {

    private static int contadorId = 1;

    private int id;
    private double peso;
    private LocalDate fechaEntregaEstimada;
    private EstadoEnvio estado;

    public Paquete(double peso) {
        setPeso(peso);
        this.id = contadorId++;
        this.estado = EstadoEnvio.PENDIENTE;
        this.fechaEntregaEstimada = calcularFechaEstimada(peso);
    }

    private LocalDate calcularFechaEstimada(double peso) {
        LocalDate hoy = LocalDate.now();
        if (peso >= 1 && peso < 5) {
            return hoy.plusDays(1);
        } else if (peso >= 5 && peso < 10) {
            return hoy.plusDays(2);
        } else if (peso >= 10 && peso < 15) {
            return hoy.plusDays(4);
        } else {
            return hoy.plusDays(5);
        }
    }

    public void setPeso(double peso) {
        if (peso <= 0 || peso > 20) {
            throw new IllegalArgumentException("El peso debe estar entre 0 y 20 kg. Peso introducido: " + peso);
        }
        this.peso = peso;
    }

    public boolean estaRetrasado() {
        return LocalDate.now().isAfter(fechaEntregaEstimada) && estado != EstadoEnvio.ENTREGADO;
    }

    public void entregar() {
        if (this.estado == EstadoEnvio.ENTREGADO) {
            throw new IllegalArgumentException("El paquete con ID " + id + " ya ha sido entregado anteriormente.");
        }
        this.estado = EstadoEnvio.ENTREGADO;
    }

    // Getters
    public int getId() { return id; }
    public double getPeso() { return peso; }
    public LocalDate getFechaEntregaEstimada() { return fechaEntregaEstimada; }
    public EstadoEnvio getEstado() { return estado; }


    public void setEstado(EstadoEnvio estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Paquete{" +
                "id=" + id +
                ", peso=" + peso + " kg" +
                ", fechaEstimada=" + fechaEntregaEstimada +
                ", estado=" + estado +
                ", retrasado=" + estaRetrasado() +
                '}';
    }
}
