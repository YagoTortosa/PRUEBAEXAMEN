package EJ5;

public class Cliente {
    private String DNI;
    private String nombre;

    public Cliente(String DNI, String nombre) {

        validarDNI(DNI);
        validarNombre(nombre);
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        validarDNI(DNI);
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        validarNombre(nombre);
        this.nombre = nombre;
    }


    private void validarDNI(String DNI) {
        final String formato = "^\\d{8}[A-Za-z]$";
        if (DNI == null || !DNI.matches(formato)) {
            throw new IllegalArgumentException("Formato invalido o es null");
        }
    }

    private void validarNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ni ser nulo ni estar vacio");
        }
    }



}
