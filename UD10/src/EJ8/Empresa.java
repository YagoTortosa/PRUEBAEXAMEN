package EJ8;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() { return empleados; }




    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void eliminarEmpleado(Empleado e) {
        empleados.remove(e);
    }

    @Override
    public String toString() {
        return "Empresa: " + nombre + " | Nº empleados: " + empleados.size();
    }
}
