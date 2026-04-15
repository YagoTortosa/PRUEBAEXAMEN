package BOSS;

public abstract class Dispositivo implements Comparable<Dispositivo>{
    protected String nombre;
    protected Ubicacion ubicacion;

    public Dispositivo(String nombre, Ubicacion ubicacion) {

        if (nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre no es valido");
        }
        if (ubicacion == null) {
            throw new IllegalArgumentException("La ubicacion no puede ser nula");
        }
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacio");
        }
        this.nombre = nombre;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        if (ubicacion == null) {
            throw new IllegalArgumentException("La ubicacion no puede ser nula");
        }
        this.ubicacion = ubicacion;
    }

    protected abstract String mostrarEstado();

    @Override
    public int compareTo(Dispositivo o) {
        return ubicacion.name().toString().compareTo(o.ubicacion.name().toString());
    }
}
