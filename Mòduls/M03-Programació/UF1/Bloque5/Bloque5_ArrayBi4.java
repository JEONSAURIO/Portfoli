package Bloque5;

import java.util.Scanner;

public class Bloque5_ArrayBi4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numI, sumaT = 0, sumaF = 0;
        int[][] bid = new int[4][5];

        for (int i = 0; i < bid.length; i++) {
            numI = i;
            sumaF = 0;
            for (int j = 0; j < bid[i].length; j++) {

                if (j == 0) {
                    System.out.print(i + " ");
                } else {
                    numI *= 2;
                    System.out.print(numI + " ");
                }
                sumaF += numI;
            }

            System.out.println(" ");
            System.out.println("La suma de la fila " + i + " es: " + sumaF);
            sumaT += sumaF;
        }
        System.out.println("La suma total de todas las filas es: " + sumaT);
    }

}
