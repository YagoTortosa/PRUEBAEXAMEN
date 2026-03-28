package EJ8;

import java.util.Comparator;

public class ComparaSalario implements Comparator<Empleado> {
    @Override
    public int compare(Empleado o1, Empleado o2) {
        return Double.compare(o1.getSalarioBase(), o2.getSalarioBase());
    }
}
