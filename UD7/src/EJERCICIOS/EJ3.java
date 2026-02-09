package MAINS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static FUNCIONES.FuncionTres.menuHistorial;

public class EJ3 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> historialAcciones = new ArrayList<>();
        int opcionElegida;

        do {
            opcionElegida = menuHistorial(historialAcciones);

            switch (opcionElegida) {
                case 1:
                    System.out.print("Introduce la acción: ");
                    String accion = sc.nextLine();
                    historialAcciones.add(accion);
                    System.out.println("Acción añadida.");
                    break;
                case 2:
                    for (int i = 0; i < historialAcciones.size();) {
                        String ultimaAccion = historialAcciones.getLast();
                        historialAcciones.remove(ultimaAccion);
                        System.out.println("Se ha deshecho: " + ultimaAccion);
                        break;
                    }
                case 3:
                    System.out.println("Historial: " + historialAcciones);
                    break;

            }


        } while (opcionElegida < 4);

        System.out.println("Has salido del menú.");

    }
}
