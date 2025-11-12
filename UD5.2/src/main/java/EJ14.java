import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int billete500 = 500;
        final int billete200 = 200;
        final int billete100 = 100;
        final int billete50 = 50;
        final int billete20 = 20;
        final int billete10 = 10;
        final int billete5 = 5;

        int contBillete500 = 0;
        int contBillete200 = 0;
        int contBillete100 = 0;
        int contBillete50 = 0;
        int contBillete20 = 0;
        int contBillete10 = 0;
        int contBillete5 = 0;

        System.out.print("Introduce una cantidad: ");
        int cantidad = sc.nextInt();

        if (cantidad % 5 == 0) {

            while (cantidad >= billete500) {
                cantidad -= billete500;
                contBillete500++;
            }
            while (cantidad >= billete200) {
                cantidad -= billete200;
                contBillete200++;
            }
            while (cantidad >= billete100) {
                cantidad -= billete100;
                contBillete100++;
            }
            while (cantidad >= billete50) {
                cantidad -= billete50;
                contBillete50++;
            }
            while (cantidad >= billete20) {
                cantidad -= billete20;
                contBillete20++;
            }
            while (cantidad >= billete10) {
                cantidad -= billete10;
                contBillete10++;
            }
            while (cantidad >= billete5) {
                cantidad -= billete5;
                contBillete5++;
            }

            if (contBillete500 > 0) System.out.println(contBillete500 + " billetes de 500€");
            if (contBillete200 > 0) System.out.println(contBillete200 + " billetes de 200€");
            if (contBillete100 > 0) System.out.println(contBillete100 + " billetes de 100€");
            if (contBillete50 > 0) System.out.println(contBillete50 + " billetes de 50€");
            if (contBillete20 > 0) System.out.println(contBillete20 + " billetes de 20€");
            if (contBillete10 > 0) System.out.println(contBillete10 + " billetes de 10€");
            if (contBillete5 > 0) System.out.println(contBillete5 + " billetes de 5€");

        } else {
            System.out.println("La cantidad introducida no es múltiplo de 5.");
        }
    }
}
