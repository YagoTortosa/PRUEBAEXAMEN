package EJ2;

import java.util.ArrayList;
import java.util.List;

public class EmpresaPrincipal {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(new JefeEquipo("Ana García", 3000.0));
        listaEmpleados.add(new Programador("Luis Pérez", 2500.0));
        listaEmpleados.add(new Administrativo("Marta Ruiz", 2000.0));

        mostrarSalarios(listaEmpleados);

    }

    public static void mostrarSalarios(List<Empleado> listaEmpleados) {
        System.out.println("----INFORME DE SALARIOS----");
        for (Empleado empleado : listaEmpleados) {
            double salarioFinal = empleado.calcularSalario();
            System.out.println("Empleado: " + empleado.getNombre() + " / " + "Salario: " + salarioFinal + "$");
        }
    }

}
