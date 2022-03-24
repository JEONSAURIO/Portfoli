package Bloque2;

import java.util.Scanner;

public class EjercicioBisiesto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int año;
        System.out.println("Añade un año");
        año = in.nextInt();

        if (año % 4 == 0) {
            if (año % 100 == 0) {
                if (año % 400 == 0) {
                    System.out.println("Es bisiesto");
                } else {
                    System.out.println("No es bisiesto");
                }
            } else {
                System.out.println("Es bisiesto");
            }
        } else {
            System.out.println("No es bisiesto");
        }

    }
}
