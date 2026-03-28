package EJ8;

public class Administrativo extends Empleado {

    public Administrativo(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    public Administrativo(String nombre, double salarioBase, Dispositivo dispositivo) {
        super(nombre, salarioBase, dispositivo);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(this);
        if (getDispositivoElectronico() != null) {
            System.out.println("  Dispositivo: " + getDispositivoElectronico());
        } else {
            System.out.println("  Dispositivo: Sin dispositivo asignado");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " / Categoria: Administrativo";
    }

}
