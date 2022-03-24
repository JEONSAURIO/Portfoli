package Bloque1;

import java.util.Scanner;

public class Bloque1_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, rq;

        System.out.println("Añade Número : ");
        n1 = in.nextDouble();

        rq = Math.sqrt(n1);

        System.out.printf("La raíz cuadrada es: %.2f", rq);
    }
}
