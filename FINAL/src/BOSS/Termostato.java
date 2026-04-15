package BOSS;

public class Termostato extends Dispositivo implements IEncendible,IRegulable {
    private EstadoDispositivo estado;
    private double temperatura;

    public Termostato(String nombre, Ubicacion ubicacion) {
        super(nombre, ubicacion);
        this.estado = EstadoDispositivo.APAGADO;
        this.temperatura = 17.5;
    }

    public EstadoDispositivo getEstado() {
        return estado;
    }

    public void setEstado(EstadoDispositivo estado) {
        this.estado = estado;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    protected String mostrarEstado() {
        if (estado.equals(EstadoDispositivo.APAGADO)) {
            return nombre + " en " + ubicacion.toString().toLowerCase() + " esta " + estado.toString().toLowerCase();
        }
        return nombre + " en " + ubicacion.toString().toLowerCase() + " esta ajustado a " + temperatura;
    }

    @Override
    public void encender() {
        if (estado == EstadoDispositivo.ENCENDIDO) {
            throw new IllegalArgumentException("El termostato ya esta encendido");
        }
        this.estado = EstadoDispositivo.ENCENDIDO;
    }

    @Override
    public void apagar() {
        if (estado == EstadoDispositivo.APAGADO) {
            throw new IllegalArgumentException("El termostato ya esta apagado");
        }
        this.estado = EstadoDispositivo.APAGADO;
    }

    @Override
    public void bajar()  {
        if (estado == EstadoDispositivo.APAGADO) {
            throw new IllegalArgumentException("El termostato esta apagado");
        }
        temperatura -= 0.5;
    }

    @Override
    public void subir() {
        if (estado == EstadoDispositivo.APAGADO) {
            throw new IllegalArgumentException("El termostato esta apagado");
        }
        temperatura += 0.5;
    }
}
