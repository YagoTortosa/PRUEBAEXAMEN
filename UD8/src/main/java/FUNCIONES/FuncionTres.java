package FUNCIONES;

import java.util.*;

public class FuncionTres {

    public static void imprimePositivo(int p) throws IllegalArgumentException, InputMismatchException {
        if (p < 0) {
            throw new IllegalArgumentException("Error, numero deberia ser positivo");
        } else {
            System.out.println(p);
        }
    }


    public static void imprimeNegativo(int n) throws IllegalArgumentException, InputMismatchException {
        if (n >= 0) {
            throw new IllegalArgumentException("Error, numero deberia ser negativo");
        } else {
            System.out.println(n);
        }
    }
}
