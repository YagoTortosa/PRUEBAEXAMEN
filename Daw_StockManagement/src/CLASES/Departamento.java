public enum Departamento {
    MARKETING(3500),
    DIRECCION(15000),
    INFORMATICA(10000),
    RRHH(5000);

    private final double saldo;

    Departamento(double saldo) {
        this.saldo = saldo;
    }
}
