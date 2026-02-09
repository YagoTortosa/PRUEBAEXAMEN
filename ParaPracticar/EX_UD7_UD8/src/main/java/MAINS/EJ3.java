package MAINS;

import FUNCIONES.FuncionTres;

import java.util.InputMismatchException;
import java.util.Scanner;

import static FUNCIONES.FuncionTres.calcularPuntuacion;


public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Introduce el número de victorias:");
            int victorias = sc.nextInt();
            System.out.println("Introduce el número de empates:");
            int empates = sc.nextInt();
            System.out.println("Introduce el número de derrotas:");
            int derrotas = sc.nextInt();

            int puntuacion = calcularPuntuacion(victorias, empates, derrotas);
            System.out.println("Puntuación obtenida: " + puntuacion);

        } catch (FuncionTres.LimitePartidasEx e) {
            System.out.println("Error de límite de partidas: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error en los datos introducidos: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor, introduce un número entero válido.");
        }
    }
}
