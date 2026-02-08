package EJERCICIOS;

import static FUNCIONES.FuncionDos.convertirOroEnGemas;

public class EJ2 {
    public static void main(String[] args) {

        try {
            System.out.println(convertirOroEnGemas("500"));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
