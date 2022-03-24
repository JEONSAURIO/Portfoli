package Bloque5;

import java.util.Scanner;

public class Bloque5_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] lletres = new char[5];

        intro(lletres);
        System.out.println("intro paraula");
        String paraula = in.nextLine();
        esbrina(lletres, paraula);
    }

    public static void esbrina(char[] cadena, String paraula) {

        boolean esPot, trobada;
        char letra;

        esPot = true;
        for (int i = 0; i < paraula.length(); i++) {
            letra = paraula.charAt(i);
            trobada = false;
            for (int j = 0; j < cadena.length; j++) {
                if (letra == cadena[j]) {
                    trobada = true;
                }
            }
            if (trobada == false) {
                esPot = false;
            }

        }
        if (esPot == false) {
            System.out.println("No es pot");
        } else {
            System.out.println("Si que es pot");
        }

    }

    public static void intro(char[] lletres) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < lletres.length; i++) {
            lletres[i] = in.nextLine().charAt(0);
        }
    }
}
