package FUNCIONES;

import java.util.*;


public class FuncionCuatro {
    public static int[] rellenarVector(int tam)  {
        Scanner sc = new Scanner(System.in);

        Set<Integer> conjunto = new HashSet<>();

        while (conjunto.size() < tam) {
            try {
                System.out.print("Introduce número: ");
                int num = sc.nextInt();
                conjunto.add(num);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Índice fuera de los límites del array.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Solo se permite introducir números.");
                sc.nextLine();
            }
        }


        int [] vector = new int[tam];

        List<Integer> lista = new ArrayList<>(conjunto);

        for (int i = 0; i < vector.length; i++) {
            vector[i] = lista.get(i);

        }


        return vector;
    }




    public static void convertirImprimirVector(int[] vector) {

        List<Integer> lista = new ArrayList<>();

        for (int i : vector) {
            lista.add(i);
        }

        /*for (int n : lista) {
            System.out.print(n + " - ");
        }*/

        for (int i = 1; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " - ");
        }

    }
}
