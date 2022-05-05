package EXAMEN;

import java.util.Scanner;

public class EX1 {

    public static final int INTENTOS = 10;
    public static final int FILAS = 8;
    public static final int COLUMNAS = 8;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[][] tablero = {
            {"", "", "", "", "", "X", "", ""},
            {"", "", "", "", "", "", "", ""},
            {"", "X", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "X", ""},
            {"", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", ""},
            {"", "", "", "X", "", "", "", ""},
            {"", "", "", "", "", "", "X", ""}
};

        int cont = 0, acierto = 0;

        do {
            System.out.println("Escoge una fila");
            int fila = in.nextInt();
            System.out.println("Escoge una columna");
            int columna = in.nextInt();

            if (fila == 0 || fila == FILAS - 1) {
                System.out.println("Posición no válida");
            } else if ((tablero[fila - 1][columna]).equals("N") || (tablero[fila + 1][columna]).equals("N")) {
                System.out.println("Posición no válida");
            } else {
                if (columna == 0 || columna == COLUMNAS - 1) {
                    System.out.println("Posición no válida");
                } else if (tablero[fila][columna - 1].equals("N") || (tablero[fila][columna + 1]).equals("N")) {
                    System.out.println("Posición no válida");
                } else {
                    System.out.println("Posición válida");
                    tablero[fila][columna] = "N";
                    acierto++;
                }
            }

            cont++;
        } while (cont != INTENTOS && acierto != 4);

        if (acierto != 4) {
            System.out.println("Se han acabado tus intentos");
            System.out.println("No lo has logrado :(");
        } else {
            System.out.println("ENHORABUENA!!! Lo has logrado! :DDD");
        }
    }

}
