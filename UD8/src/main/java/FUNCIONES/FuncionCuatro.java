package FUNCIONES;

import java.util.*;


public class FuncionCuatro {
    public static void rellenarVector(int tam)  {
        Scanner sc = new Scanner(System.in);

        Set<Integer> conjunto = new HashSet<>();

        for (int i = 0; i < tam; i++) {

        }




        try {

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del array.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Solo se permite introducir números.");
        }


    }




    public static void convertirImprimirVector(int[] vector) {

        List<Integer> lista = new ArrayList<>();

        Set<Integer> conjunto = new HashSet<>(lista);

        System.out.println("Conjunto: " + conjunto);

    }
}
