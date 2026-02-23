package EJ3;

public class Vehiculo {
     String marca;
     String modelo;
     double velocidadActual;
     double velocidadMaxima;
     static int totalVehiculosCreados = 0;

    public Vehiculo(String marca, String modelo, double velocidadMaxima) throws ExcesoVelocidadEx {
        if (marca.isEmpty())
            throw new IllegalArgumentException("Marca no puede ser vacía");
        if (modelo.isEmpty())
            throw new IllegalArgumentException("Modelo no puede ser vacío");
        if (velocidadMaxima <= 0)
            throw new IllegalArgumentException("La velocidad máxima debe ser mayor que 0");

        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0.0;
        totalVehiculosCreados++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isEmpty())
            throw new IllegalArgumentException("Marca no puede ser vacía");
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty())
            throw new IllegalArgumentException("Modelo no puede ser vacío");
        this.modelo = modelo;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima <= 0) {
            throw new IllegalArgumentException("La velocidad máxima debe ser mayor que 0");
        }
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
        this.velocidadMaxima = velocidadMaxima;
    }

    public static int getTotalVehiculosCreados() {
        return totalVehiculosCreados;
    }

    public void acelerar(double cantidad) throws ExcesoVelocidadEx {
        if (cantidad < 0)
            throw new IllegalArgumentException("La cantidad a acelerar no puede ser negativa");

        double nueva = velocidadActual + cantidad;

        if (nueva > velocidadMaxima)
            throw new ExcesoVelocidadEx("La velocidad excede la máxima permitida: " + velocidadMaxima);

        velocidadActual = nueva;
    }

    public void frenar(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad a frenar no puede ser negativa");
        }

        velocidadActual -= cantidad;

        if (velocidadActual < 0)
            velocidadActual = 0;

    }

    public void mostrarInfoVehiculo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }


    public static class ExcesoVelocidadEx extends Exception {
        public ExcesoVelocidadEx(String mensaje) {
            super(mensaje);
        }
    }


}

