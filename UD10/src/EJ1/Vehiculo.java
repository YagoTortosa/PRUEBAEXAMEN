package EJ1;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadActual;
    protected int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadActual, int velocidadMaxima) {
        validarMarca(marca);
        validarModelo(modelo);
        validarVelocidadActual(velocidadActual);
        validarVelocidadMaxima(velocidadMaxima);

        if (velocidadActual > velocidadMaxima)
            System.out.println("Has sobrepasado la velocidad maxima permitida!");

        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        validarMarca(marca);
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        validarModelo(modelo);
        this.modelo = modelo;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        validarVelocidadActual(velocidadActual);
        validarExcesoDeVelocidad(velocidadActual, velocidadMaxima);
        this.velocidadActual = velocidadActual;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        validarVelocidadMaxima(velocidadMaxima);
        validarExcesoDeVelocidad(velocidadActual, velocidadMaxima);
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidadActual=" + velocidadActual +
                ", velocidadMaxima=" + velocidadMaxima +
                '}';
    }


    // METODOS

    public void validarModelo(String modelo) {
        if (modelo == null || modelo.isEmpty())
            throw new IllegalArgumentException("El modelo no puede estar nulo o vacio");
    }

    public void validarMarca(String marca) {
        if (marca == null || marca.isEmpty())
            throw new IllegalArgumentException("La marca no puede estar nula o vacia");
    }

    public void validarVelocidadActual(double velocidadActual) {
        if (velocidadActual < 0)
            throw new IllegalArgumentException("La velocidad actual no puede ser negativa");
    }

    public void validarVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima < 0)
            throw new IllegalArgumentException("La velocidad maxima no puede ser negativa");
    }

    protected void validarExcesoDeVelocidad(int velocidaActual, int velocidadMaxima) {
        if (velocidadActual > velocidadMaxima)
            System.out.println("Has sobrepasado la velocidad maxima permitida!");
    }

    public void acelerar(int incremento) {
        this.velocidadActual += incremento;
        validarExcesoDeVelocidad(velocidadActual, velocidadMaxima);
    }


}
