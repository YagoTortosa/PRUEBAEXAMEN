package EJ8;

public class Programador extends Empleado {
    private final double BONO_PRODUCTIVIDAD;
    private Estado estadoVPN;

    public Programador(String nombre, double salarioBase, double bonoProductividad, Estado estadoVPN) {
        super(nombre, salarioBase);
        BONO_PRODUCTIVIDAD = bonoProductividad;
        this.estadoVPN = estadoVPN;
    }

    public double getBonoProductividad() {
        return BONO_PRODUCTIVIDAD;
    }


    public Estado getEstadoVPN() {
        return estadoVPN;
    }

    public void setEstadoVPN(Estado estadoVPN) {
        this.estadoVPN = estadoVPN;
    }


    @Override
    public double calcularSalario() {
        final double BONO_PRODUCTIVIDAD = 1.10;
        return salarioBase * BONO_PRODUCTIVIDAD;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + " / " + "Salario: " + salarioBase + " euros " + " / Categoria: Programador";
    }


}
