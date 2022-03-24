package EjsBasicos;

import java.util.Scanner;

public class EJS2_7 {

    public static final int FILAS = 9;
    public static final int COLUMNAS = 9;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] sudoku = new int[FILAS][COLUMNAS];
        int veces = 0;
        veces = in.nextInt();

        for (int i = 0; i < veces; i++) {
            sudoku = llegirSudoku(in);
            if (esFilaValida(sudoku) && esColumnaValida(sudoku) && esRegioValida(sudoku)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        }

    }

    public static int[][] llegirSudoku(Scanner in) {

        int[][] nums = new int[FILAS][COLUMNAS];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = in.nextInt();
            }
            System.out.println("");
        }

        return nums;

    }

    public static boolean esFilaValida(int[][] sudoku) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (sudoku[i].equals(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean esColumnaValida(int[][] sudoku) {
        for (int i = 0; i < COLUMNAS; i++) {
            for (int j = 0; j < FILAS; j++) {
                if (sudoku[i].equals(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean esRegioValida(int[][] sudoku) {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                for (int k = 0; k < 8; k++) {
                    for (int l = k + 1; l < 9; l++) {
                        if (sudoku[i + k % 3][j + k / 3] == sudoku[i + l % 3][j + l / 3]) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

}
