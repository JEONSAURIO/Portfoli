package EjsBasicos;

import java.util.Scanner;

public class EJS2_5 {

    public static final int FILAS = 4;
    public static final int COLUMNAS = 4;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qué te gustaría hacer? \n 1. Matriz aleatoria \n 2. Matriz manual \n 3. Genera matriz");
        int eleccion = in.nextInt();

        switch (eleccion) {
            case 1:
                int[][] matriz = new int[FILAS][COLUMNAS];
                mostraMatriu(matriz);
                break;
            case 2:
                System.out.println("Filas:");
                int files = in.nextInt();
                System.out.println("Columnas");
                int columnes = in.nextInt();

                demanaMatriu(files, columnes, in);
                break;
            case 3:
                System.out.println("Filas:");
                int files1 = in.nextInt();
                System.out.println("Columnas");
                int columnes1 = in.nextInt();

                System.out.println("Valor mínimo");
                int min = in.nextInt();
                System.out.println("Valor máximo");
                int max = in.nextInt();
                generaMatriu(files1, columnes1, min, max);
                break;
            default:
                System.out.println("Opción no válida");
                break;

        }
    }

    public static void mostraMatriu(int[][] matriz) {

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = (int) (Math.random() * 50);
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println("");
        }
    }

    public static int[][] demanaMatriu(int files, int columnes, Scanner in) {
        int[][] matriz2 = new int[files][columnes];
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                matriz2[i][j] = (int) (Math.random() * 50);
                System.out.printf("%d ", matriz2[i][j]);
            }
            System.out.println("");
        }
        return null;

    }

    public static int[][] generaMatriu(int files, int columnes, int min, int max) {
        int[][] matriz3 = new int[files][columnes];
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                matriz3[i][j] = (int) (Math.random() * (max - min)) + min;
                System.out.printf("%d ", matriz3[i][j]);
            }
            System.out.println("");
        }
        return null;

    }
}
