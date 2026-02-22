package EJ3;

public class Vehiculo {
    String marca;
    String modelo;
    double velocidadActual;
    double velocidadMaxima;
    int totalVehiculosCreados;

    public Vehiculo(String marca, String modelo, double velocidadActual,double velocidadMaxima) throws VelocidadMaxSuperada {

        if (marca.isEmpty() || modelo.isEmpty()) {
            throw new IllegalArgumentException("La marca y el modelo no pueden estar vacíos");
        }

        if (velocidadActual < 0 || velocidadActual > velocidadMaxima) {
            throw new VelocidadMaxSuperada("La velocidad actual debe ser entre 0 y la velocidad máxima");
        }


        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = 0.0;
        this.velocidadMaxima = velocidadMaxima;
        totalVehiculosCreados++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getTotalVehiculosCreados() {
        return totalVehiculosCreados;
    }

    public void setTotalVehiculosCreados(int totalVehiculosCreados) {
        this.totalVehiculosCreados = totalVehiculosCreados;
    }


    public void acelerar(double cantidad) throws VelocidadMaxSuperada {
        if (velocidadActual + cantidad > velocidadMaxima) {
            throw new VelocidadMaxSuperada("Has superado la velocidad máxima del vehículo");
        } else {
            velocidadActual += cantidad;
        }
    }

    public void frenar(double cantidad) {
        if (velocidadActual - cantidad < 0) {
            velocidadActual = 0;
        } else {
            velocidadActual -= cantidad;
        }
    }

    public void imprimir() {
        System.out.println("Marca: " + marca + " Modelo: " + modelo + " Velocidad Actual: " + velocidadActual + " Velocidad Máxima: " + velocidadMaxima);
    }

    public static class VelocidadMaxSuperada extends Exception {
        public VelocidadMaxSuperada(String mensaje) {
            super(mensaje);
        }
    }

}
