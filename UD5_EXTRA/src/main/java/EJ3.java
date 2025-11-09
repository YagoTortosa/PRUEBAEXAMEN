import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero del 1 al 7: ");
        int num = sc.nextInt();

        String dia = switch (num) {
            case 1 -> dia = "Lunes";
            case 2 -> dia = "Martes";
            case 3 -> dia = "Miercoles";
            case 4 -> dia ="Jueves";
            case 5 -> dia = "Viernes";
            case 6 -> dia = "Sabado";
            case 7 -> dia = "Domingo";
            default -> dia = "Numero invalido";
        };
        System.out.println(dia);
    }
}
