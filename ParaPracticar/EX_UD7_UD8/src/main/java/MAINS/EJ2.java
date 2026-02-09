package MAINS;

import java.util.*;



public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce la cantidad de oro que deseas convertir en gemas: ");
            String cantidadOro = sc.nextLine();
            int gemasObtenidas = convertirOroEnGemas(cantidadOro);
            System.out.println("Has obtenido " + gemasObtenidas + " gemas.");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
