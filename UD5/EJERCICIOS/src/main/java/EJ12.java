import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Como te llamas? ");
        String nombre = sc.nextLine();
        System.out.print("Cuál es tu género (H o M)? ");
        String genero = sc.nextLine();

        genero = genero.toUpperCase();

        char primerLetra = nombre.charAt(0);
        primerLetra = Character.toUpperCase(primerLetra);

        final String grupoA = "A";
        final String grupoB = "B";

        if (genero.equals("M") && primerLetra <= 'M') {
            System.out.println("Tu grupo es " + grupoA);
        } else if (genero.equals("H") && primerLetra >= 'N') {
            System.out.println("Tu grupo es " + grupoA);
        } else {
            System.out.println("Tu grupo es " + grupoB);
        }
    }
}
