public class Persona {
    //static final String dni;
    String nombre;
    String apellidos;
    int edad;

    // Constructores

    public Persona(String dni ,String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona(String nombre, String apellidos, int edad) {
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

    // METODOS

    public void imprime() {
        System.out.println("DNI: " + this.dni + " Nombre: " + this.nombre + " Apellidos: " + this.apellidos);
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    public boolean esJubilado() {
        return this.edad >= 65;
    }

    public int diferenciaEdad(Persona otraPersona) {
        return Math.abs(this.edad - otraPersona.getEdad());
    }

}


