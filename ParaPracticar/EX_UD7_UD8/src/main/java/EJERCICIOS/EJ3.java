package EJERCICIOS;

import FUNCIONES.FuncionTres;

import static FUNCIONES.FuncionTres.calcularPuntuacion;


public class EJ3 {
    public static void main(String[] args) {
        try {
            int puntuacion = calcularPuntuacion(-5, 10, 2);
            System.out.println("Puntuación obtenida: " + puntuacion);

        } catch (FuncionTres.LimitePartidasEx e) {
            System.out.println("Error de límite de partidas: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Error en los datos introducidos: " + e.getMessage());
        }
    }
}
