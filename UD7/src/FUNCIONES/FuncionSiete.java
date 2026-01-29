package FUNCIONES;

import java.util.*;

public class FuncionSiete {
    public static List<String> validarInventario (Map<String, Integer> stockProductos) {

        List<String> errores = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : stockProductos.entrySet()) {
            String producto = entry.getKey();
            Integer cantidad = entry.getValue();

            if (producto.isEmpty()) {
                errores.add("\t-> Nombre inválido para un producto con cantidad: " + cantidad);
            }

            if (cantidad < 0 || cantidad > 100) {
                errores.add("\t-> Cantidad inválida para el producto: '" + producto + "'");
            }
        }

        return errores;
    }
}
