package Bloque3;

import java.util.Scanner;

public class Bloque3_15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nom;
        String nom2;
        int leng;
        System.out.println("Dame tu nombre");
        nom = in.nextLine();

        System.out.println("Hola " + nom);

        leng = nom.length();
        System.out.println("Tiene de largo : " + leng);

        char letra = nom.charAt(3);
        System.out.println("El caracter en la posición 3 és: " + letra);

        System.out.println("Dame otro nombre");
        nom2 = in.nextLine();

        boolean iguales = nom.contentEquals(nom2);
        if (iguales) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
        System.out.println(nom.toUpperCase());
        System.out.println(nom2.toLowerCase());
    }
}
