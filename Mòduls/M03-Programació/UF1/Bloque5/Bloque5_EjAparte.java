package Bloque5;

import java.util.Scanner;

public class Bloque5_EjAparte {

    public static final int Notas = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Alumnos : ");
        int alumnos = in.nextInt();
        /* Que demani quant alumnat ha fet l'examen i, per cada alumne, que demani les notes dels tres exercicis. Cal comprovar si son correctes. */
        int[][] ejercicio = new int[alumnos][Notas];
        int[] notas = new int[Notas];
        boolean valido = true;

        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < Notas; j++) {
                do {
                    if (j == 0) {
                        notas[j] = (int) (Math.random() * 3);
                        valido = false;
                    } else if (j == 1) {
                        notas[j] = (int) (Math.random() * 4);
                        valido = false;
                    } else if (j == 2) {
                        notas[j] = (int) (Math.random() * 6);
                        valido = false;
                    }
                    System.out.print(ejercicio[i][j] + " ");

                    System.out.println(" ");
                } while (valido == false);
            }

            int suma = 0;
            for (int j = 0; j < Notas; j++) {
                /* Calcula la nota de l'examen de l'alumne i digui si ha aprovat o suspès.*/
                suma += notas[j];
                System.out.printf("%d ", notas[j]);
            }
            System.out.println(" ");

            System.out.println(suma);
            if (suma < 5) {
                System.out.println("Suspendido");
            } else {
                System.out.println("Aprobado");
            }
            /*Que en acabar mostri les següents estadístiques: mitjanes de cada exercici i d'examen, notes d'examen més baixa i més alta, i percentatge d'aprovats.*/

        }
    }
}
