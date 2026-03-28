package EJ8;

public class Programador extends Empleado implements TrabajadorRemoto {
    private EstadoVPN estadoVPN;

    public Programador(String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.estadoVPN = EstadoVPN.DESCONECTADO;
    }

    public Programador(String nombre, double salarioBase, Dispositivo dispositivo) {
        super(nombre, salarioBase, dispositivo);
        this.estadoVPN = EstadoVPN.DESCONECTADO;
    }

    @Override
    public double calcularSalario() {
        final double BONO_PRODUCTIVIDAD = 1.10;
        return salarioBase * BONO_PRODUCTIVIDAD;
    }

    @Override
    public String toString() {
        return super.toString() + " / Categoria: Programador";
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
}
