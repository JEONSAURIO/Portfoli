package Bloque4;

import java.util.Scanner;

public class Bloque4_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, mult, resultado;

        for (num = 2; num <= 10; num++) {
            if (num % 2 == 0) {
                for (mult = 0; mult <= 10; mult++) {
                    resultado = num * mult;
                    System.out.printf("%d por %d es %d \n", num, mult, resultado);
                }

            }

        }
    }

}
