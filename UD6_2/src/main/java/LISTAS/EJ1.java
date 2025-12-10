package LISTAS;

import java.util.ArrayList;
import java.util.Arrays;

public class EJ1 {
    public static void main(String[] args) {

        ArrayList<String> amigos = new ArrayList<>();

        amigos.add("Juanmica");
        amigos.add("Unai");
        amigos.add("Causa");
        amigos.add("Yago");
        amigos.add("Mala");
        amigos.add("pedro");

        for (String amigo : amigos) {
            System.out.println(amigo);
        }


    }
}
