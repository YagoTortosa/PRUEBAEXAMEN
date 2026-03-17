package EJ2;

public abstract class Empleado {
    private String nombre;
    private double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        if (nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("Nombre no puede ser null o estar vacío");
        if (salarioBase <= 0)
            throw new IllegalArgumentException("El salario base no puede ser 0 o negativo");

        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }




    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 0)
            throw new IllegalArgumentException("El salario base no puede ser 0 o negativo");

        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("Nombre no puede ser null o estar vacío");

        this.nombre = nombre;
    }


    // METODOS

    public abstract double calcularSalario();

    public String mostrarInformacion() {
        return "Nombre: " + nombre + " / SalarioBase: " + salarioBase;
    }


}
