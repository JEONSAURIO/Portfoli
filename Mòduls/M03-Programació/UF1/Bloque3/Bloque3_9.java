package Bloque3;

import java.util.Scanner;

public class Bloque3_9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float notas;
        int cont, apr = 0, sus = 0, sufi = 0, be = 0, not = 0, exc = 0;

        for (cont = 0; cont < 10; cont++) {

            System.out.println("Añade nota");
            notas = in.nextFloat();

            if ((notas < 5) && (notas >= 0)) {
                sus++;
            } else if (notas < 6) {
                sufi++;
                apr++;
            } else if (notas < 7) {
                be++;
                apr++;
            } else if (notas < 8.5) {
                not++;
                apr++;
            } else if (notas <= 10) {
                exc++;
                apr++;
            } else {
                System.out.println("Nota NO válida");
                cont--;
            }

        }
        System.out.printf("%d alumnos han suspendido y %d alumnos han aprobado", sus, apr);
        System.out.printf("%d un suficiente, %d un bien, %d un notable y %d un excelente", sufi, be, not, exc);
    }
}
