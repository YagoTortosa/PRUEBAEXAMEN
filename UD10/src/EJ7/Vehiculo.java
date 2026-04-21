package EJ7;

public abstract class Vehiculo {
    protected final String matricula;
    protected final String modelo;

    public Vehiculo(String matricula, String modelo) {
        if (matricula == null || matricula.isEmpty())
            throw new IllegalArgumentException("La matricula no puede ser null o estar vacia");
        if (modelo == null || modelo.isEmpty())
            throw new IllegalArgumentException("El modelo no puede ser null o estar vacia");
        this.matricula = matricula;
        this.modelo = modelo;
    }


    public String getMatricula() {
        return matricula;
    }


    public String getModelo() {
        return modelo;
    }

    //METODOS

    public abstract void validarMatricula();


}
