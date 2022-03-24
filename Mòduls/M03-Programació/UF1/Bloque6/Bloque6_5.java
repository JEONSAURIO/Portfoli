package Bloque6;

import java.util.Scanner;

public class Bloque6_5 {

    public static final int materias = 4;
    public static final int alumnos = 5;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] notas = new int[materias][alumnos];
        llena(notas);
        medMat(notas);
        medAlm(notas);
    }

    public static void medMat(int[][] calificaciones) {
        int suma = 0;
        double mitjana = 0;
        for (int i = 0; i < materias; i++) {
            for (int j = 0; j < alumnos; j++) {
                suma += calificaciones[i][j];
            }
            mitjana = (double) suma / alumnos;
            System.out.println(" Mediana materia" + i + ": " + mitjana);
        }
    }

    public static void medAlm(int[][] calificaciones) {
        int suma = 0;
        double mitjana = 0;
        for (int j = 0; j < materias; j++) {
            suma = 0;
            for (int i = 0; i < alumnos; i++) {
                suma += calificaciones[i][j];
            }
            mitjana = (double) suma / materias;
            System.out.println(" Mediana materia" + j + ": " + mitjana);
        }
    }

    public static void llena(int[][] calificaciones) {
        for (int i = 0; i < materias; i++) {
            for (int j = 0; j < alumnos; j++) {
                calificaciones[i][j] = (int) (Math.random() * 10);
                System.out.println(calificaciones[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
