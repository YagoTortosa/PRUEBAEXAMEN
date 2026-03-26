package EJ8;

public class Administrativo extends Empleado {

    public Administrativo(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + " / " + "Salario: " + salarioBase + " euros " + " / Categoria: Administrativo";
    }

}
