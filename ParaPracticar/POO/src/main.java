import java.time.LocalDate;

public class main {
    public static void main(String[] args)  {
        try{
            Cliente e=new Cliente("12345678A","");
            Cliente e1=new Cliente("12345678Q","david");
            System.out.println(e.datosCliente());
            Habitacion r=new Habitacion(1,TipoHabitacion.INDIVIDUAL);
            Habitacion r1=new Habitacion(2,TipoHabitacion.INDIVIDUAL);

            Hotel a=new Hotel("Manel");

            a.agregarHabitaciones(r);
            a.agregarHabitaciones(r1);

            System.out.println(a.hacerReserva(e,1, LocalDate.of(2025,3,8),LocalDate.of(2025,3,9)));
            System.out.println(a.hacerReserva(e1,-1, LocalDate.of(2025,3,9),LocalDate.of(2025,3,10)));
            System.out.println(a.buscarHabitacion(4));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
