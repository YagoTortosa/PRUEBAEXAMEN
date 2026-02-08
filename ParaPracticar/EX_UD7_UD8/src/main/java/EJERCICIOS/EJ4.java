package EJERCICIOS;

import FUNCIONES.FuncionCuatro;

public class EJ4 {
        public static void main(String[] args) {
            String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()~_+;";

            try {
                String pass = FuncionCuatro.GeneradorContrasenas.generarContrasena(12, CARACTERES);
                System.out.println("Contraseña generada: " + pass);
            } catch (IllegalArgumentException | FuncionCuatro.ContrasenyaInvalidaEx e) {
                System.out.println("Error: " + e.getMessage());
            }

        }
}
