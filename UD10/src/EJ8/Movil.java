package EJ8;

import java.util.Objects;

public class Movil implements Dispositivo {
    private String modelo;
    private Estado estadoVPN;

    public Movil(String modelo, Estado estadoVPN) {
        if (modelo == null || modelo.isEmpty())
            throw new IllegalArgumentException("El modelo no puede ser nulo o estar vacio.");

        this.modelo = modelo;
        this.estadoVPN = estadoVPN;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty())
            throw new IllegalArgumentException("El modelo no puede ser nulo o estar vacio.");
        this.modelo = modelo;
    }

    public Estado getEstadoVPN() {
        return estadoVPN;
    }

    public void setEstadoVPN(Estado estadoVPN) {
        this.estadoVPN = estadoVPN;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movil movil = (Movil) o;
        return Objects.equals(modelo, movil.modelo) && estadoVPN == movil.estadoVPN;
    }

}
