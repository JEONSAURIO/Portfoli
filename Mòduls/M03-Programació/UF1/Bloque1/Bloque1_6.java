package Bloque1;

import java.util.Scanner;

public class Bloque1_6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1, n2, div;

        System.out.println("Primer Número");
        n1 = in.nextFloat();
        System.out.println("Segundo Número");
        n2 = in.nextFloat();

        div = n1 / n2;

        System.out.printf("La división es: %.2f", div);
    }
}
