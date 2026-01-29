package FUNCIONES;

import java.util.List;
import java.util.Scanner;

public class FuncionTres {
    public static int menuHistorial(List<String> acciones) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Menú Historial de Acciones ---");
        System.out.println("1. Añadir acción");
        System.out.println("2. Deshacer última acción");
        System.out.println("3. Mostrar historial");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
        int opcionElegida = sc.nextInt();

        if (opcionElegida <= 0) {
            System.out.println("Opción invalida. Por favor, elige una opción válida:");
            opcionElegida = sc.nextInt();
        }

        return opcionElegida;
    }
}
