package Bloque2;

import java.util.Scanner;

public class Bloque2_15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota;

        System.out.println("Añade nota : ");
        nota = in.nextDouble();

        if (nota < 5) {
            System.out.println("Suspendido");
        } else if (nota < 6) {
            System.out.println("Aprobado");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 8.5) {
            System.out.println("Notable");
        } else {
            System.out.println("Excelente");
        }
    }
}
