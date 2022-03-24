package Bloque5;

import java.util.Scanner;

public class Bloque5_ArrayBi5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numI, sumaC = 0, sumaCT = 0;
        int[][] bid = new int[4][5];

        for (int i = 0; i < bid.length; i++) {
            numI = i;
            for (int j = 0; j < bid[i].length; j++) {
                numI *= 2;

            }
        }

        for (int j = 0; j < bid[0].length; j++) {
            sumaC = 0;
            for (int i = 0; i < bid.length; i++) {
                sumaC += bid[i][j];

            }
            System.out.println("La suma de la columna " + j + " es: " + sumaC);

            for (int i = 0; i < bid.length; i++) {

                for ( j = 0; j < bid[i].length; j++) {
                }
            }

        }
    }
}



