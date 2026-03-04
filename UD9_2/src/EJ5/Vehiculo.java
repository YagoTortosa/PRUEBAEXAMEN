package EJ5;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private TipoVehiculo tipoVehiculo;
    private TipoCombustible tipoCombustible;
    private boolean disponible;

    public Vehiculo(String matricula, String marca, String modelo, TipoVehiculo tipoVehiculo, TipoCombustible tipoCombustible, Boolean disponible) {

        validarMatricula(matricula);
        validarMarca(marca);
        validarModelo(modelo);
        validarTipoCombustible(tipoCombustible);
        validarTipoVehiculo(tipoVehiculo);


        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
        this.tipoCombustible = tipoCombustible;
        this.disponible = true;
    }

    // GETTERS Y SETTERS

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        validarMatricula(matricula);
        this.matricula = matricula;
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

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        validarTipoVehiculo(tipoVehiculo);
        this.tipoVehiculo = tipoVehiculo;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        validarTipoCombustible(tipoCombustible);
        this.tipoCombustible = tipoCombustible;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }


    // METODOS

    private void validarMatricula(String matricula) {
        final String formato = "^\\d{4}[A-Z]{3}$";
        if (matricula.isEmpty() || !matricula.matches(formato))
            throw new IllegalArgumentException("Formato de matricula inválido o no puede dejar  el campo vacío");

    }

    private void validarMarca(String marca) {
        if (marca == null || marca.isEmpty())
            throw new IllegalArgumentException("La marca y el modelo no puede ser nula o estar vacia");

    }

    private void validarModelo(String modelo) {
        if (modelo == null || modelo.isEmpty())
            throw new IllegalArgumentException("El modelo no puede ser nulo o estar vacio");

    }

    private void validarTipoVehiculo(TipoVehiculo tipoVehiculo) {
        if (tipoVehiculo == null)
            throw new IllegalArgumentException("El tipo de vehiculo no puede ser nulo");
    }

    private void validarTipoCombustible(TipoCombustible tipoCombustible) {
        if (tipoCombustible == null)
            throw new IllegalArgumentException("El tipo de combustible no puede ser nulo");
    }

    public void alquilar() {
        if (!disponible) {
            throw new IllegalStateException("El vehiculo esta alquilado");
        }
        disponible = false;
    }

    public boolean devolver() {
        return disponible = true;
    }

    public void infoVehiculo() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo de Vehiculo: " + tipoVehiculo);
        System.out.println("Tipo de Combustible: " + tipoCombustible);
        System.out.println("Disponibilidad: " + disponible);
    }

}
