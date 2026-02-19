package EJ1;


public class main {
    public static void main(String[] args) {
        try {
            Producto p1 = new Producto("Camiseta", 5,30);

            p1.vender(2);
            System.out.println("Stock después de la venta: " + p1.getStock());
            p1.reponer(1);
            System.out.println("Stock después de reponer: " + p1.getStock());
            System.out.println("\n---Información del producto---");
            p1.mostrarInfo();



        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear el producto: " + e.getMessage());
        } catch (Producto.StockInsuficiente e) {
            System.out.println("Error! " + e.getMessage());
        }

    }



}
