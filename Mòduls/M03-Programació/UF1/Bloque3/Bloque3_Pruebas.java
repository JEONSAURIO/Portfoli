package Bloque3;

import java.util.Scanner;

public class Bloque3_Pruebas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int resultat = 1, valor, i;

        System.out.println("Añade un valor");
        valor = in.nextInt();

        //****************************FOR****************************//
        for (i = valor; i >= 1; i--) {
            resultat = resultat * i;
        }
        System.out.println("resultat es :" + resultat);

        //***************************WHILE***************************//
        i = valor;
        resultat = 1;
        while (i >= 1) {
            resultat = resultat * i;
            i--;
        }
        System.out.println("resultat es :" + resultat);

        //**************************DO WHILE**************************//
        i = valor;
        resultat = 1;
        do {
            resultat = resultat * i;
            i--;
        } while (i >= 1);
        System.out.println("resultat es :" + resultat);
    }

}
