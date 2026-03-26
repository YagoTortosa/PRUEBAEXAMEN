package EJ8;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;
    protected Dispositivo dispositivoElectronico;

    public Empleado(String nombre, double salarioBase) {
        if (nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("El nombre no puede ser null o estar vacio.");
        if (salarioBase <= 0)
            throw new IllegalArgumentException("El salario base no puede ser 0 o ser negativo");

        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("El nombre no puede ser null o estar vacio.");
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 0)
            throw new IllegalArgumentException("El salario base no puede ser 0 o ser negativo");
        this.salarioBase = salarioBase;
    }

    // METODOS

    public abstract double calcularSalario();

    public String mostrarInformacion() { return "Empleado: " + nombre + " / " + " Salario Base: " + salarioBase + " €.";}

    @Override
    public String toString() {
        return "Empleado: " + nombre + " / " + "Salario: " + salarioBase + " euros";
    }

}
