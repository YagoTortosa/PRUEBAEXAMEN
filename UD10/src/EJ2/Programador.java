package EJ2;

public class Programador extends Empleado {

    public Programador(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        final double bonoProductividad = 0.1;
        return getSalarioBase() + (getSalarioBase() * bonoProductividad);
    }
}
