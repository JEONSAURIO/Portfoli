package Bloque3;

import java.util.Scanner;

public class Bloque3_TriFac {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int piedrasmax, piedras = 0, lados = 0;

        System.out.println("Cuántas piedras tienes?");
        piedrasmax = in.nextInt();

        while (piedras <= piedrasmax) {
            lados++;
            piedras = piedras + lados;

        }
        System.out.println("Tiene " + (lados - 1) + " lados, y sobran " + (piedrasmax - (piedras - lados)) + " piedras");
    }

}
