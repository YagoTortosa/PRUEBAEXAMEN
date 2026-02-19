package EJ2;

public class Estudiante {
    int nia;
    String nombre;
    int edad;
    String ciclo;
    double notaFinal;

    public Estudiante(String nombre, int nia, int edad, String ciclo, double notaFinal) {
        validarNIA(nia);

        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        if (edad < 16 || edad > 100) {
            throw new IllegalArgumentException("Edad inválida");
        }

        if (ciclo.equals("GM") || ciclo.equals("GS")) {
            throw new IllegalArgumentException("Ciclo inválido");
        }

         if (notaFinal < 0.0 || notaFinal > 10.0) {
            throw new IllegalArgumentException("Nota final inválida");
        }


        this.nombre = nombre;
        this.nia = nia;
        this.edad = edad;
        this.ciclo = ciclo;
        this.notaFinal = notaFinal;
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
            validarNIA(nia);
        this.nia = nia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    // Metodos

    public void validarNIA(int nia) {
        String niaTransformado = String.valueOf(nia);
        if (!niaTransformado.matches("//d{8}[0-9]")) {
            throw new IllegalArgumentException("NIA invalido.");
        }
    }

    public boolean aprueba() {
        return this.notaFinal >= 5.0;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("NIA: " + this.nia);
        System.out.println("Edad: " + this.edad);
        System.out.println("Ciclo: " + this.ciclo);
        System.out.println("Nota Final: " + this.notaFinal);
    }

}
