package MAINS;


import static FUNCIONES.FuncionCinco.resultadoDivision;
import static FUNCIONES.FuncionCinco.vectorRellenado;

public class EJ5 {
    public static void main(String[] args) {



        int[] miVector = vectorRellenado();

        int resultado = resultadoDivision(miVector);

        System.out.println("\nResultado de la división: " + resultado);



    }
}
