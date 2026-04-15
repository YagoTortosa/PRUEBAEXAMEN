package BOSS;

public class Alarma extends Dispositivo implements IEncendible {
    private EstadoAlarma estado;

    public Alarma(String nombre, Ubicacion ubicacion) {
        super(nombre, ubicacion);
        this.estado = EstadoAlarma.DESACTIVADA;
    }

    public EstadoAlarma getEstado() {
        return estado;
    }

    public void setEstado(EstadoAlarma estado) {
        this.estado = estado;
    }

    @Override
    protected String mostrarEstado() {
        return nombre + " en " + ubicacion.toString().toLowerCase() + " esta " + estado.toString().toLowerCase();
    }

    @Override
    public void encender() {
        if (estado == EstadoAlarma.SONANDO || estado == EstadoAlarma.ACTIVADA) {
            throw new IllegalArgumentException("La alarma ya esta activada");
        }
        this.estado = EstadoAlarma.ACTIVADA;
    }

    @Override
    public void apagar() {
        if (estado == EstadoAlarma.DESACTIVADA) {
            throw new IllegalArgumentException("La alarma ya esta desactivada");
        }
        this.estado = EstadoAlarma.DESACTIVADA;
    }

    public String detectarIntrusion(){
        if (estado == EstadoAlarma.ACTIVADA){
            estado = EstadoAlarma.SONANDO;
            return "Alerta: " + nombre.toLowerCase() + " en " + ubicacion.toString().toLowerCase() + " está " + estado.toString().toLowerCase() + " por intrusión!";
        }
        return nombre.toLowerCase() + " en " + ubicacion.toString().toLowerCase()+ " está " + estado.toString().toLowerCase() + ", te lo van a robar todo!";

    }
}
