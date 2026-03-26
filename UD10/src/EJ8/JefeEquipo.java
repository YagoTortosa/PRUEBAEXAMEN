package EJ8;

public class JefeEquipo extends Empleado {
    private final double BONO_ADICIONAL;
    private Estado estadoVPN;

    public JefeEquipo(String nombre, double salarioBase, double bonoAdicional) {
        super(nombre, salarioBase);
        BONO_ADICIONAL = bonoAdicional;
    }

    public double getBonoAdicional() {
        return BONO_ADICIONAL;
    }


    @Override
    public String toString() {
        return "Empleado: " + nombre + " / " + "Salario: " + salarioBase + " euros " + " / Categoria: Jefe de equipo";
    }


    @Override
    public double calcularSalario() {
        final double BONO_ADICIONAL = 1.25;
        return salarioBase * BONO_ADICIONAL;
    }
}
