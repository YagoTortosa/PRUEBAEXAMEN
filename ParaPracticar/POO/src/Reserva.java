import java.time.LocalDate;

public class Reserva {
    Cliente cliente;
    Habitacion habitacion;
    LocalDate fechaEntrada;
    LocalDate fechaSalida;

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public Reserva(Cliente cliente, Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        if (!fechaEntrada.isAfter(fechaSalida)) {
            this.fechaSalida = fechaSalida;
        }else {
            throw new IllegalArgumentException("e");
        }
    }

    public String datosReserva(){
        return "Reserva de "+cliente.getNombre()+" en habitacion "+habitacion.getNumero()+" del "+fechaEntrada+" al "+fechaSalida;
    }

}
