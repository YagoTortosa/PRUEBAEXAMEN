package EJ3;

import java.time.LocalDate;

public class Paquete {
    private int identificador;
    private double peso;
    private LocalDate fechaEntregaEstimada;
    private EstadoEnvio estado;

    public Paquete(double peso) {
        if (peso < 0)
            throw new IllegalArgumentException("El peso del paquete no puede ser negativo.");

        if (peso > 20)
            throw new IllegalArgumentException("El peso del paquete no puede superar los 20 Kg.");

        if (peso > 1 && peso < 5)
            LocalDate.now().plusDays(1);
        if (peso > 5 && peso < 10)
            LocalDate.now().plusDays(2);
        if (peso > 10 && peso < 15)
            LocalDate.now().plusDays(4);
        if (peso > 15 && peso < 20)
            LocalDate.now().plusDays(5);

        this.identificador += 1;
        this.peso = peso;
        this.fechaEntregaEstimada = LocalDate.now();
        this.estado = EstadoEnvio.PENDIENTE;
    }

    public int getIdentificador(int idPaquete) {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        if (identificador < 0)
            throw new IllegalArgumentException("El identificador no puede ser negativo");
        this.identificador = identificador;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0)
            throw new IllegalArgumentException("El peso del paquete no puede ser negativo.");
        if (peso > 20)
            throw new IllegalArgumentException("El peso del paquete no puede superar los 20 Kg.");
        this.peso = peso;
    }

    public LocalDate getFechaEntregaEstimada() {
        return fechaEntregaEstimada;
    }

    public void setFechaEntregaEstimada(LocalDate fechaEntregaEstimada) {
        this.fechaEntregaEstimada = fechaEntregaEstimada;
    }

    // METODOS

    public void estaRetrasado() {
        if (fechaEntregaEstimada.isAfter(LocalDate.now()) && !estado.equals(EstadoEnvio.ENTREGADO))
            System.out.println("La fecha actual no puede ser posterior a la fecha estimada y el estado del paquete no esta entregado.");
    }


    public void entregar() {
        if (estado.equals(EstadoEnvio.ENTREGADO))
            throw new IllegalArgumentException("No se puede entregar un paquete que ya ha sido entregado.");

        this.estado = EstadoEnvio.ENTREGADO;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "identificador=" + identificador +
                ", peso=" + peso +
                ", fechaEntregaEstimada=" + fechaEntregaEstimada +
                ", estado=" + estado +
                '}';
    }




}
