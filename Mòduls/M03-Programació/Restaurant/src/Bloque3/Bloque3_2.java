package Bloque3;

import java.util.Scanner;

public class Bloque3_2 {

    public static final int CLIENTE = 3;
    public static final int PLATO = 5;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] platos = {"pescado", "ensalada", "bistec", "sopa", "pollo"};
        String[] clientes = {"Aiman", "Jeon", "Adri"};
        int[][] clifi = {
            {0, 4, 3, 1, 3},
            {2, 3, 4, 2, 2},
            {0, 2, 4, 4, 1}
        };
        int platMax;
        int vecesPlatMax;
        for (int i = 0; i < CLIENTE; i++) {
            platMax = 0;
            vecesPlatMax = clifi[i][0];
            for (int j = 0; j < PLATO; j++) {
                if (clifi[i][j] > vecesPlatMax) {
                    platMax = j;
                    vecesPlatMax = clifi[i][j];
                }
            }
            System.out.println("Pla perferit de " + clientes[i] + " és "
                    + platos[platMax] + ". L'ha pres "
                    + vecesPlatMax + " aquest mes ");
        }
    }
}
