package MAPAS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        String nombre;
        double precio;

        Map<String ,Double> productos = new HashMap<>();

        do {
            System.out.println("Gestión de Productos");
            System.out.println("1. Introducir un producto");
            System.out.println("2. Modificar el precio de un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar todos los productos");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            sc.nextLine();



            switch (opcion) {
                case 1:
                    do {
                        System.out.print("Introduce el nombre del producto: ");
                        nombre = sc.nextLine();

                        System.out.print("Introduce el precio del producto: ");
                        precio = sc.nextDouble();

                        sc.nextLine();

                    } while (nombre.isEmpty() && precio < 0);

                    productos.put(nombre, precio);
                    System.out.println("Producto anadido correctamente.\n");
                    break;

                case 2:
                    System.out.print("Introduce el nombre del producto: ");
                    nombre = sc.nextLine();

                    if (productos.containsKey(nombre)) {
                        System.out.print("Introduce el nuevo precio del producto: ");
                        precio = sc.nextDouble();

                        sc.nextLine();

                        productos.put(nombre, precio);
                        System.out.println("Producto actualizado correctamente.\n");
                    } else {
                        System.out.println("El producto no existe.\n");
                    }
                    break;

                case 3:

                    do {
                        System.out.print("Introduce el nombre del producto a eliminar: ");
                        nombre = sc.nextLine();

                    } while (nombre.isEmpty());

                    if (productos.containsKey(nombre)) {
                        productos.remove(nombre);
                        System.out.println("Producto eliminado correctamente.\n");
                    } else {
                        System.out.println("El producto no existe.\n");
                    }
                    break;

                case 4:
                    System.out.println("Listado de productos: ");
                    for (Map.Entry<String, Double> producto : productos.entrySet()) {
                        System.out.println(producto.getKey() + " - " + producto.getValue() + "$");
                    }
                    System.out.println();
                    break;
            }

        } while (opcion != 5);


        System.out.println("Has finalizado la gestión.");


    }
}
