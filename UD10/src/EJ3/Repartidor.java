package EJ3;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Repartidor {
    private String nombre;
    private String dni;
    private List<Paquete> paquetes;

    public Repartidor(String nombre, String dni) {
        if (nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("El nombre no puede ser nulo o estar vacio.");

        validarDNI(dni);

        this.nombre = nombre;
        this.dni = dni;
        this.paquetes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("El nombre no puede ser nulo o estar vacio.");

        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        validarDNI(dni);
        this.dni = dni;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    // METODOS

    private void validarDNI(String DNI) {
        final String formato = "^\\d{8}[A-Za-z]$";
        if (DNI == null || !DNI.matches(formato)) {
            throw new IllegalArgumentException("Formato invalido o es null");
        }
    }

    public void asignarPaquete(Paquete paq) throws LimitePaquetesExcedidos {
        if (paquetes.size() >= 10)
            throw new LimitePaquetesExcedidos("No se puede tener mas de 10 paquetes asignados a la vez.");
        paq.setEstado(EstadoEnvio.EN_REPARTO);
        paquetes.add(paq);
    }

    public void entregarPaquete(int idPaquete) {
        for (Paquete paquete : paquetes) {
            if (paquete.getId() == idPaquete) {
                paquetes.remove(paquete);
                return;
            }
        }
        throw new NoSuchElementException("No se encontro el paquete con el ID especificado.");
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", paquetes=" + paquetes +
                '}';
    }
}


