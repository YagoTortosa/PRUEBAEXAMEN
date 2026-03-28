package EJ1;

public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, String modelo, int velocidadActual, int velocidadMaxima) {
        super(marca, modelo, velocidadActual, velocidadMaxima);
        if (numeroPuertas <= 0) {
            throw new IllegalArgumentException("El numero de puerta no puede ser menor que 0");
        }
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        if (numeroPuertas <= 0) {
            throw new IllegalArgumentException("El numero de puerta no puede ser menor que 0");
        }
        this.numeroPuertas = numeroPuertas;
    }


    @Override
    public void acelerar(int incremento) {
        super.acelerar(incremento);
    }
}
