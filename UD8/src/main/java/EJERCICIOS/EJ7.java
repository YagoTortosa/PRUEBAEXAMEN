package EJERCICIOS;

import static FUNCIONES.FuncionSiete.*;

public class EJ7 {
    public static void main(String[] args) {


        try {
            System.out.println("Suma: " + sumar(10, 5));
            System.out.println("Resta: " + restar(10, 5));
            System.out.println("Multiplicación: " + multiplicar(10, 5));
            System.out.println("División: " + dividir(10, 3));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
