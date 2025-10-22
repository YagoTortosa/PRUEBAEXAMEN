import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce base: ");
        int base = sc.nextInt();
        System.out.println("Introduce altura: ");
        int altura = sc.nextInt();

        int area = (base * altura) / 2;
        System.out.println("El area de un  triangulo isosceles es " + area);
    }
}
