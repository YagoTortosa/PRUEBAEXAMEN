package FUNCIONES;
import java.util.Random;

public class FuncionCuatro {
    public static class ContrasenyaInvalidaEx extends Exception {
        public ContrasenyaInvalidaEx(String mensaje) {
            super(mensaje);
        }
    }



    public class GeneradorContrasenas {

        public static String generarContrasena(int longitud, String CARACTERES)
                throws ContrasenyaInvalidaEx {

            // Validar longitud
            if (longitud < 8 || longitud > 16) {
                throw new IllegalArgumentException(
                        "La longitud de la contraseña debe estar entre 8 y 16 caracteres."
                );
            }

            Random random = new Random();
            StringBuilder contrasena = new StringBuilder();

            for (int i = 0; i < longitud; i++) {
                int indice = random.nextInt(CARACTERES.length());
                contrasena.append(CARACTERES.charAt(indice));
            }

            String resultado = contrasena.toString();

            // Verificar que tenga al menos un carácter especial
            if (!contieneCaracterEspecial(resultado)) {
                throw new ContrasenyaInvalidaEx(
                        "La contraseña generada no contiene caracteres especiales."
                );
            }

            return resultado;
        }

        private static boolean contieneCaracterEspecial(String texto) {
            return texto.matches(".*[!@#$%^&*()~_+;].*");
        }
    }



}
