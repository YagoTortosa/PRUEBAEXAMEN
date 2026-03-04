import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    String nombre;
    ArrayList<Habitacion> habitaciones=new ArrayList<>();
    ArrayList<Reserva> reservas=new ArrayList<>();

    public Hotel(String nombre) {
        this.nombre = nombre;
    }
    public void agregarHabitaciones(Habitacion habitacion){
        habitaciones.add(habitacion);
    }

    public Habitacion buscarHabitacion(int numeroHabitacion){
       boolean verificar=false;
       ArrayList<Integer> numerosReserva=new ArrayList<>();

        if (numeroHabitacion<0){
            return null;
        }

        for (Habitacion e:habitaciones){
            numerosReserva.add(e.getNumero());
        }

        if (!numerosReserva.contains(numeroHabitacion)){
            throw new IllegalArgumentException("La habitacion buscada no exixte");
        }

        for (Habitacion habitacion:habitaciones){
            if (numeroHabitacion==habitacion.getNumero()){
                return habitacion;
            }

        }

        return null;
    }

    public boolean hacerReserva(Cliente cliente, int numeroHabitacion, LocalDate fechaEntrada,LocalDate fechaSalida){

        if (!fechaEntrada.isBefore(fechaSalida)){
            throw new IllegalArgumentException("La fecha de salida no puede ser anterior a la de entrada");
        }

        Habitacion habitacion=buscarHabitacion(numeroHabitacion);

        if (habitacion!=null){
            if (!habitacion.estaDisponible(fechaEntrada,fechaSalida)){
                throw new IllegalArgumentException("La habitacion no esta disponible");
            }
            Reserva reserva=new Reserva(cliente,habitacion,fechaEntrada,fechaSalida);
            habitacion.agregarReserva(reserva);
            reservas.add(reserva);
            return true;
        }else {
            return false;
       }

    }
}
