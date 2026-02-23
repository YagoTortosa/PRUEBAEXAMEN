package EJ3;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {
     String nombre;
     List<Vehiculo> listaVehiculos;

    public Concesionario(String nombre) {
        if (nombre.isEmpty())
            throw new IllegalArgumentException("El nombre del concesionario no puede ser null o estar vacío");

        this.nombre = nombre;
        this.listaVehiculos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty())
            throw new IllegalArgumentException("El nombre del concesionario no puede ser vacío");

        this.nombre = nombre;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null)
            throw new NullPointerException("El vehículo no puede ser null");

        this.listaVehiculos.add(vehiculo);
    }

    public Vehiculo buscarVehiculo(String marca, String modelo) {
        if (marca.isEmpty() || modelo.isEmpty())
            throw new IllegalArgumentException("Marca o modelo no pueden ser vacíos");

        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getMarca().equals(marca) && vehiculo.getModelo().equals(modelo))
                return vehiculo;
        }
        return null;
    }

    public void venderVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null)
            throw new NullPointerException("El vehículo no puede ser null");

        for (Vehiculo v : listaVehiculos) {
            if (v.getMarca().equals(vehiculo.getMarca()) && v.getModelo().equals(vehiculo.getModelo())) {
                listaVehiculos.remove(v);
                return;
            }
        }
    }

    public void imprimirCatalogoVehiculos() {
        System.out.println("Catálogo de vehículos en el concesionario " + nombre + ":");
        if (listaVehiculos.isEmpty()) {
            System.out.println("(sin vehículos)");
            return;
        }
        for (Vehiculo vehiculo : listaVehiculos) {
            vehiculo.mostrarInfoVehiculo();
        }
    }



}
