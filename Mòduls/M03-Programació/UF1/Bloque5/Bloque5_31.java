package Bloque5;

import java.util.Scanner;

public class Bloque5_31 {

    public static final int Vendedor = 4;
    public static final int Producto = 7;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma = 0, maxI = 0, maximI = 0;
        int[][] bid = new int[5][10];

        for (int i = 0; i < Vendedor; i++) {
            for (int j = 0; j < Producto; j++) {
                bid[i][j] = (int) (Math.random() * 50);
                System.out.print(bid[i][j] + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < Vendedor; i++) {
            suma = 0;
            for (int j = 0; j < Producto; j++) {
                suma += bid[i][j];
            }
            System.out.println("Vendedor " + i + " : " + suma);
            if (suma > maxI) {
                maxI = suma;
                maximI = i;
            }
        }
        System.out.println("El vendedor con más ventas es el " + maximI);

        int i = 0, maxJ = 0, maximJ = 0;
        for (int j = 0; j < Producto; j++) {
            suma = 0;
            for (i = 0; i < Vendedor; i++) {
                suma += bid[i][j];
            }
            System.out.println("Producte " + j + " : " + suma);
            if (suma > maxJ) {
                maxJ = suma;
                maximJ = j;
            }
        }
        System.out.println("El mejor producto : " + maximJ);

    }
}
