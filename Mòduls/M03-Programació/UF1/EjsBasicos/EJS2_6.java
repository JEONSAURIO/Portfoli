package EjsBasicos;

import java.util.Scanner;

public class EJS2_6 {

    public static final int FILAS = 6;
    public static final int COLUMNAS = 6;

    public static void main(String[] args) {

        int[][] buscaminas = new int[FILAS][COLUMNAS];

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                buscaminas[i][j] = ((int) ((Math.random() * 2)) - 1);

            }
        }
        comptaMines(buscaminas);
    }

    public static int[][] comptaMines(int[][] buscaminas) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (buscaminas[i][j] == 0) {
                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int w = j - 1; w <= j + 1; w++) {
                            if ((k == -1) || (k == FILAS) || (w == -1) || (w == FILAS)) {
                            } else {
                                if (buscaminas[k][w] == -1) {
                                    buscaminas[i][j]++;
                                }
                            }

                        }
                    }
                }
                System.out.print(buscaminas[i][j] + " ");
            }
            System.out.println("");
        }
        return null;

    }

}
