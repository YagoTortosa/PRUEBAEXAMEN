package EJ3;

public class Vehiculo {
    String marca;
    String modelo;
    double velocidadActual;
    double velocidadMaxima;
    int totalVehiculosCreados;

    public Vehiculo(String marca, String modelo, double velocidadMaxima) {
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
}
