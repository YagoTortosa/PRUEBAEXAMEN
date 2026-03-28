package EJ2;

public class JefeEquipo extends Empleado {

    public JefeEquipo(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        final double bonoAdicional = 0.2;
        return getSalarioBase() + (getSalarioBase() * bonoAdicional);
    }


}
