import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int billete500 = 0;
         int billete200 = 0;
         int billete100 = 0;
         int billete50 = 0;
         int billete20 = 0;
         int billete10 = 0;
         int billete5 = 0;

        System.out.print("Introduce un cantidad: ");
        int cantidad = sc.nextInt();

        if (cantidad % 5 == 0) {
            if (cantidad / 500 == 0) {

                billete500++;
            } else if (cantidad / 200 == 0) {
                billete200++;
            } else if (cantidad / 100 == 0) {
                billete100++;
            } else if (cantidad / 50 == 0) {
                billete50++;
            } else if (cantidad / 20 == 0) {
                billete20++;
            } else if (cantidad / 10 == 0) {
                billete10++;
            } else if (cantidad / 5 == 0) {
                billete5++;
            }
        } else {
            System.out.println("La cantidad debe ser mayor que 5");
        }


    }

}
