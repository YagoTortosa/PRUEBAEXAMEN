import java.time.LocalDate;
import java.util.ArrayList;

public class Habitacion {


    int numero;
    TipoHabitacion tipoHabitacion;
    private double precioNoche;
    public ArrayList<Reserva> reservas=new ArrayList<>();

    public Habitacion(int numero, TipoHabitacion tipoHabitacion) {
        this.numero = numero;
        this.tipoHabitacion = tipoHabitacion;
        this.precioNoche=obtenerTarifaHabitacion(tipoHabitacion);
    }

    public int getNumero() {
        return numero;
    }

    public double obtenerTarifaHabitacion(TipoHabitacion tipoHabitacion){
        switch (tipoHabitacion){
            case DOBLE :
                precioNoche=85.25;
                break;
            case INDIVIDUAL:
                precioNoche=50.75;
                break;
            case SUITE:
                precioNoche=165;
                break;
        }
        return precioNoche;
    }

    public void agregarReserva(Reserva reserva){
        reservas.add(reserva);
    }

    public boolean estaDisponible(LocalDate fechaEntrada,LocalDate fechaSalida){
        boolean disponible=true;
        for (Reserva reserva:reservas){
            if (fechaEntrada.isAfter(reserva.getFechaSalida())&&fechaSalida.isBefore(reserva.getFechaEntrada())){
                disponible=false;
            }
        }
        return disponible;
    }

    public int obtenerReservasActivas(){
        int reservasActivas=0;
        for (Reserva e: reservas){
            reservasActivas++;
        }
        return reservasActivas;
    }
}
