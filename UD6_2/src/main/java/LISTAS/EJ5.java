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

                    sc.nextLine();

                    contactos.add(telefono);
                    System.out.println("Contacto anadido.\n");
                    break;
                case 2:
                    System.out.println("\nContactos: ");
                    for (String contacto : contactos) {
                        System.out.println(contacto);
                    }

                    break;
                case 3:
                    System.out.println("Introduce el nombre a buscar: ");
                    String nombreAbuscar = sc.next();

                    for (String contacto : contactos) {
                        if (contacto.equals(nombreAbuscar)) {
                            System.out.println("Nombre: " + contactos + ", Telefono: " + contactos);
                            break;
                        } else {
                            System.out.println("No se encuentra ese contacto.");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Introduce el nombre del contacto a eliminar: ");
                    String nombreDelContacto = sc.next();

                    for (String contacto : contactos) {
                        if (contacto.equals(nombreDelContacto)) {
                            contactos.remove(nombreDelContacto);
                            System.out.println("Contacto eliminado.");
                            break;
                        } else {
                            System.out.println("No se encuentra ese contacto.");
                            break;
                        }
                    }
                    break;
            }
        } while (opcion != 5);

        System.out.println("HAS SALIDO DE LA AGENDA");

    }
}
