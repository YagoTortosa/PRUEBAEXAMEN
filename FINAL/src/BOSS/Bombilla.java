package BOSS;


public class Bombilla extends Dispositivo implements IEncendible {
    private EstadoDispositivo estado;


    public Bombilla(String nombre, Ubicacion ubicacion) {
        super(nombre, ubicacion);
        this.estado = EstadoDispositivo.APAGADO;
    }

    public EstadoDispositivo getEstadodispositivo() {
        return estado;
    }

    public void setEstadodispositivo(EstadoDispositivo estadodispositivo) {
        this.estado = estadodispositivo;
    }

    @Override
    protected String mostrarEstado() {
        return nombre + " en " + ubicacion.toString().toLowerCase() + " esta " + estado.toString().toLowerCase();
    }

    @Override
    public void encender() {
        if (estado == EstadoDispositivo.ENCENDIDO)
            throw new IllegalArgumentException("La bombilla ya está encendida.");
        this.estado=EstadoDispositivo.ENCENDIDO;
    }

    @Override
    public void apagar() {
        if (estado == EstadoDispositivo.APAGADO)
            throw new IllegalArgumentException("La bombilla ya está apagada.");
        this.estado=EstadoDispositivo.APAGADO;
    }
}
