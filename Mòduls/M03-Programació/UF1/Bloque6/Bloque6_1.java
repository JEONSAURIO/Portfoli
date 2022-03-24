package Bloque6;

import java.util.Scanner;

public class Bloque6_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        classCine[] pelicula = new classCine[5];

        for (int i = 0; i < pelicula.length; i++) {
            System.out.println("Introduce director : ");
            String director = in.nextLine();

            System.out.println("Introduce titulo : ");
            String titulo = in.nextLine();

            System.out.println("Introduce tipo : ");
            String tipo = in.nextLine();

            pelicula[i] = new classCine(director, titulo, tipo);
        }
        imprime(pelicula);

    }

    public static void imprime(classCine[] peli) {
        System.out.println("Imprime el array");
        for (int i = 0; i < peli.length; i++) {
            peli[i].imprime();
        }

    }
}
