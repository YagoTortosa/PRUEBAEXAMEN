package EJ8;

public class Portatil implements Dispositivo {
    private String modelo;
    private Estado estado;

    public Portatil(String modelo) {
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
        if (!(obj instanceof Portatil)) return false;
        Portatil otro = (Portatil) obj;
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
        return "Portatil [Modelo: " + modelo + ", Estado: " + estado + "]";
    }
}
