package EJ3;

public class main {
    public static void main(String[] args) {

        try {
            Concesionario concesionario = new Concesionario("AutoMundo");

            Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", 180);
            Vehiculo vehiculo2 = new Vehiculo("Honda", "Civic", 200);
            Vehiculo vehiculo3 = new Vehiculo("Ford", "Focus", 190);

            concesionario.agregarVehiculo(vehiculo1);
            concesionario.agregarVehiculo(vehiculo2);
            concesionario.agregarVehiculo(vehiculo3);

            System.out.println("Vehículos en el concesionario:");
            for (Vehiculo v : concesionario.getListaVehiculos()) {
                System.out.println(v.getMarca() + " " + v.getModelo());
            }

            Vehiculo buscado = concesionario.buscarVehiculo("Honda", "Civic");

            if (buscado != null) {
                System.out.println("Vehículo encontrado: " + buscado.getMarca() + " " + buscado.getModelo());
                concesionario.venderVehiculo(buscado);
            } else {
                System.out.println("Vehículo no encontrado");
            }

            System.out.println("Vehículos restantes en el concesionario:");
            for (Vehiculo v : concesionario.getListaVehiculos()) {
                System.out.println(v.getMarca() + " " + v.getModelo());
            }

        } catch (Vehiculo.ExcesoVelocidadEx | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
