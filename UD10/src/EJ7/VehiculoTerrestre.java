package EJ7;

public class VehiculoTerrestre extends Vehiculo {

    private final int numRuedas;

    public VehiculoTerrestre(String matricula, String modelo, int numRuedas) {
        super(matricula, modelo);
        if (numRuedas <= 0)
            throw new IllegalArgumentException("El numero de ruedas no puede ser negativo.");
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }



    public void validarMatricula(String matricula) {
        String formato = "^//d{4}[0-9][a-Z]$";

        if (!matricula.matches(formato))
            throw new IllegalArgumentException("")

    }




}
