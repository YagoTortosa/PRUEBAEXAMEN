public class Articulo {
    private String nombreArticulo;
    private double precio;
    private double iva = 0.21;
    private int cuantosQuedan;

    // Constructores

    public Articulo(String nombreArticulo, int cuantosQuedan, double iva, double precio) {
        this.nombreArticulo = nombreArticulo;
        this.cuantosQuedan = cuantosQuedan;
        this.iva = iva;
        this.precio = precio;
    }

    // Getters y Setters

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }

    // Metodos

    public void imprimir() {
        System.out.println("Nombre: " + nombreArticulo + "Precio: " + this.precio + "IVA: " + this.iva + "Quedan: " + this.cuantosQuedan);
    }

    public double getPVP() {
        return this.precio * this.iva;
    }

    public boolean vender() {
        return this.cuantosQuedan < 0;
    }

    public boolean comprar() {
        return this.cuantosQuedan > 0;
    }


}
