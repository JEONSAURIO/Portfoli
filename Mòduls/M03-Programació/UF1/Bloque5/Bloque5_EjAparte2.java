package Bloque5;

import java.util.Scanner;

public class Bloque5_EjAparte2 {

    public static final int Animales = 5;
    public static final int Mes = 31;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] enfermos = new int[Animales][Mes];
        int suma = 0, TempMax = 0;
        //La introduccio de dades amb random i considerarem que tots els mesos tenen 31 dies.
        //Indica cual es la temperatura mitjana de tots els animals al final del mes.
        //Indica quin animal ha tingut la temperatura mitjana més alta.
        //Indica quin animal ha tingut la temperatura més alta i quin dia.
        //Indica la temperatura dels altres animals el dia que et surt a l'apartat anterior.
        //Indica, per cada animal, quant es desvia la màxima i la mínima respecte de la mitjana.

        for (int i = 0; i < Animales; i++) {
            suma = 0;
            for (int j = 0; j < Mes; j++) {
                enfermos[i][j] = (int) (Math.random() * 50);
                suma += enfermos[i][j];
                if (i == 0) {
                    TempMax = suma;

                }

            }
            System.out.println("La media es : " + ((float) suma * 100 / Mes));
        }

    }
}
