
import java.util.Scanner;

public class EJ14EX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce true o false: ");
        String booleano = sc.nextLine();

        boolean conversion = Boolean.parseBoolean(booleano);
        System.out.println(conversion);
    }
}
