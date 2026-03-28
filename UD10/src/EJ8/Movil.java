package EJ8;


public class Movil implements Dispositivo {
    private String modelo;
    private Estado estado;

    public Movil(String modelo) {
        if (modelo == null || modelo.isEmpty())
            throw new IllegalArgumentException("El modelo no puede ser nulo o estar vacio.");
        this.modelo = modelo;
        this.estado = Estado.APAGADO;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty())
            throw new IllegalArgumentException("El modelo no puede ser nulo o estar vacio.");
        this.modelo = modelo;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Movil otro)) return false;
        return this.modelo.equals(otro.modelo);
    }

    @Override
    public void encender() {
        this.estado = Estado.ENCENDIDO;
    }

    @Override
    public void apagar() {
        this.estado = Estado.APAGADO;
    }

    @Override
    public Estado estadoDispositivo() {
        return estado;
    }


    @Override
    public String toString() {
        return "Movil [Modelo: " + modelo + ", Estado: " + estado + "]";
    }
}
