package EJERCICIOS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static FUNCIONES.FuncionUno.reorganizarPorMultiplos;


public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce los números separados por espacios: ");
        String numeros = sc.nextLine();

        String[] partes = numeros.split(",");

        List<Integer> lista = new ArrayList<>();

        for (String numero : partes) {
            lista.add(Integer.parseInt(numero.trim()));
        }


        System.out.print("Introduce el divisor: ");
        int divisor = sc.nextInt();

        System.out.println("Lista reorganizada: " + reorganizarPorMultiplos(lista, divisor));





    }
}
