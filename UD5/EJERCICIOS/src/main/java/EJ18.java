import java.util.Scanner;

public class EJ18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int vegetariana = 1;
        final int noVegetariana = 2;

        System.out.println("Bienvenido a la pízzeria BELLA NAPOLI!");
        System.out.println("Tipos de pizza:");
        System.out.println("\t1 - Vegetariana");
        System.out.println("\t2 - No vegetariana\n");
        System.out.print("Introduce el numero correspondiente al tipo de pizza que quieres: ");
        int numeroPizzas = sc.nextInt();

        if (numeroPizzas == noVegetariana) {

            String ingredienteNoVegetarianoUno = "Pepperoni";
            String ingredienteNoVegetarianoDos = "Jamón";
            String ingredienteNoVegetarianoTres = "Salmón";

            System.out.println("\nIngredientes de pizzas no vegetarianas:");
            System.out.println("\t1 - Pepperoni");
            System.out.println("\t2 - Jamón");
            System.out.println("\t3 - Salmón\n");
            System.out.print("Introduce el ingrediente que deseas: ");
            int ingredienteNoVegetariano = sc.nextInt();

            switch (ingredienteNoVegetariano) {
                case 1:
                    System.out.println("Has elegido la pizza no vegetariana con tomate, mozzarella y " + ingredienteNoVegetarianoUno);
                    break;
                case 2:
                    System.out.println("Has elegido la pizza no vegetariana con tomate, mozzarella y " + ingredienteNoVegetarianoDos);
                    break;
                case 3:
                    System.out.println("Has elegido la pizza no vegetariana con tomate, mozzarella y " + ingredienteNoVegetarianoTres);
                    break;
            }
        } else if (numeroPizzas == vegetariana) {

            String ingredienteVegetarianoUno = "Pimiento";
            String ingredienteVegetarianoDos = "Tofu";


            System.out.println("\nIngredientes de pizzas vegetarianas:");
            System.out.println("\t1 - Pimiento");
            System.out.println("\t2 - Tofu");
            System.out.print("Introduce el ingrediente que deseas: ");
            int ingredienteVegetariano = sc.nextInt();

            switch (ingredienteVegetariano) {
                case 1:
                    System.out.println("Has elegido la pizza vegetariana con tomate, mozzarella y " + ingredienteVegetarianoUno);
                    break;
                case 2:
                    System.out.println("Has elegido la pizza vegetariana con tomate, mozzarella y " + ingredienteVegetarianoDos);
                    break;
            }
        } else {
            System.out.println("Elige una de las dos opciones de pizza.");
        }


    }
}
