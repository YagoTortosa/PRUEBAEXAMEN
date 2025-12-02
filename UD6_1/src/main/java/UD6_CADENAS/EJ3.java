package UD6_CADENAS;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce el primer apellido: ");
        String apellidoUno = sc.nextLine();
        System.out.print("Introduce el segundo apellido: ");
        String apellidoDos = sc.nextLine();
        
        
        String nombreCompleto = nombre.toUpperCase().substring(0, 3) + apellidoUno.toUpperCase().substring(0, 3) + apellidoDos.toUpperCase().substring(0, 3);


        System.out.println("Nombre con las iniciales en MAYUSCULAS: " + nombreCompleto);
        
    }

}
