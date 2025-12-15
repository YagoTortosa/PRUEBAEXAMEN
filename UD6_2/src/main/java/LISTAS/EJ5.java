package LISTAS;

import java.util.ArrayList;
import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        //String nombre;
        //int tlf;


        ArrayList<String> contactos = new ArrayList<>();


        do {
            System.out.print("Agenda de Contactos:");
            System.out.print("\n1. Anadir Contacto");
            System.out.print("\n2. Ver Contacto");
            System.out.print("\n3. Buscar Contactos");
            System.out.print("\n4. Eliminar Contacto");
            System.out.print("\n5. Salir");

            System.out.print("\nElige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\nIntroduce el nombre: ");
                    String nombre = sc.next();
                    contactos.add(nombre);
                    System.out.print("Introduce el telefono: ");
                    String telefono = sc.next();
                    contactos.add(telefono);
                    System.out.print("Contacto anadido.");
                    break;
                case 2:
                    System.out.print("\nContactos: ");
                    System.out.println("Nombre: " + contactos.get(0) + ", Telefono: " + contactos.get(1));
                    break;
                case 3:
                    System.out.println("Introduce el nombre a buscar: ");
                    String nombreAbuscar = sc.next();
                case 4:
                    System.out.println();

            }




        } while (opcion != 5);

        System.out.println("HAS SALIDO DE LA AGENDA");

    }
}
