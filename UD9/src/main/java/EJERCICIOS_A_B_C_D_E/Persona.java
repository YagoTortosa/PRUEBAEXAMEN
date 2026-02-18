public class Persona {

    // Atributos
    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public static final int MAYORIA_EDAD = 18; // static y final

    // Constructores
    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        if (!validarDNI(dni)) {
            throw new IllegalArgumentException("DNI no válido");
        }
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Getters y Setters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos
    public void imprime() {
        System.out.println("DNI: " + dni + " Nombre: " + nombre + " Apellidos: " + apellidos);
    }

    public boolean esMayorDeEdad() {
        return edad >= MAYORIA_EDAD;  // uso del static final
    }

    public boolean esJubilado() {
        return edad >= 65;
    }

    public int diferenciaEdad(Persona otraPersona) {
        return Math.abs(this.edad - otraPersona.edad);
    }

    public static boolean validarDNI(String dni) {
        if (!dni.matches("\\d{8}[A-Za-z]")) {
            return false;
        }
        return true;
    }
}
