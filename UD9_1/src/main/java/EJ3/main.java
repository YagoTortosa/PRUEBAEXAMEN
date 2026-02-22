package EJ3;

public class main {
    public static void main(String[] args) throws Vehiculo.VelocidadMaxSuperada {
        Vehiculo coche1 = new Vehiculo("Toyota", "Corolla", 0.0, 180.0);
        Vehiculo coche2 = new Vehiculo("Honda", "Civic", 20.0, 200.0);

        try {
            coche1.acelerar(50.0);
            System.out.println("Velocidad actual de coche1: " + coche1.getVelocidadActual() + " km/h");

            coche1.acelerar(150.0);
        } catch (Vehiculo.VelocidadMaxSuperada e) {
            System.out.println(e.getMessage());
        }

        try {
            coche2.acelerar(100.0);
            System.out.println("Velocidad actual de coche2: " + coche2.getVelocidadActual() + " km/h");

            coche2.acelerar(20.0);
        } catch (Vehiculo.VelocidadMaxSuperada e) {
            System.out.println(e.getMessage());
        }



    }
}
