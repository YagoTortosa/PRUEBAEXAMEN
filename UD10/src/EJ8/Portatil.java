package EJ8;

import java.util.Objects;

public class Portatil implements Dispositivo {
    private String modelo;
    private Estado estadoVPN;

    public Portatil(String modelo, Estado estadoVPN) {
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
        Portatil portatil = (Portatil) o;
        return Objects.equals(modelo, portatil.modelo) && estadoVPN == portatil.estadoVPN;
    }


}
