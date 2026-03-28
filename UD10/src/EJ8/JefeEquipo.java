package EJ8;

public class JefeEquipo extends Empleado implements TrabajadorRemoto {
    private EstadoVPN estadoVPN;

    public JefeEquipo(String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.estadoVPN = EstadoVPN.DESCONECTADO;
    }

    public JefeEquipo(String nombre, double salarioBase, Dispositivo dispositivoElectronico) {
        super(nombre, salarioBase, dispositivoElectronico);
        this.estadoVPN = EstadoVPN.DESCONECTADO;
    }

    @Override
    public double calcularSalario() {
        final double BONO_ADICIONAL = 1.25;
        return salarioBase * BONO_ADICIONAL;
    }


    @Override
    public void conectarVPN() {
        this.estadoVPN = EstadoVPN.CONECTADO;
    }

    @Override
    public void desconectarVPN() {
        this.estadoVPN = EstadoVPN.DESCONECTADO;
    }

    @Override
    public EstadoVPN estadoConexionVPN() {
        return estadoVPN;
    }

    @Override
    public String toString() {
        return super.toString() + " / Categoria: Jefe de equipo";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(this);
        System.out.println("  VPN: " + estadoVPN);
        if (getDispositivoElectronico() != null) {
            System.out.println("  Dispositivo: " + getDispositivoElectronico());
        } else {
            System.out.println("  Dispositivo: Sin dispositivo asignado");
        }
    }


}
