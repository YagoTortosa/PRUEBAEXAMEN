package BOSS;

public class Persiana extends Dispositivo implements IRegulable{
    private EstadoPersiana estado;

    public Persiana(String nombre, Ubicacion ubicacion) {
        super(nombre, ubicacion);
        this.estado = EstadoPersiana.SUBIDA;
    }

    public EstadoPersiana getEstado() {
        return estado;
    }

    public void setEstado(EstadoPersiana estado) {
        this.estado = estado;
    }

    @Override
    protected String mostrarEstado() {
        return nombre + " en " + ubicacion.toString().toLowerCase() + " esta " + estado.toString().toLowerCase();
    }

    @Override
    public void bajar() {
        if (estado == EstadoPersiana.AVERIADA) {
            throw new IllegalArgumentException("La persiana está averiada y no puede moverse");
        }
        if (estado == EstadoPersiana.BAJADA){
            estado = EstadoPersiana.AVERIADA;
            throw new IllegalArgumentException("La persiana ya esta bajada y quedara averiada");
        }
        estado=EstadoPersiana.BAJADA;
    }

    @Override
    public void subir() {
        if (estado == EstadoPersiana.AVERIADA) {
            throw new IllegalArgumentException("La persiana está averiada y no puede moverse");
        }
        if (estado == EstadoPersiana.SUBIDA){
            estado = EstadoPersiana.AVERIADA;
            throw new IllegalArgumentException("La persiana ya esta subida y quedara averiada");
        }
        estado=EstadoPersiana.SUBIDA;
    }
}
