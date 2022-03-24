package Bloque1;

import java.util.Scanner;
import java.lang.Math;

public class Bloque1_9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double c1, c2, hip;

        System.out.println("Primer cateto : ");
        c1 = in.nextDouble();
        System.out.println("Segundo cateto : ");
        c2 = in.nextDouble();

        hip = Math.sqrt((c1 * c1) + (c2 * c2));

        System.out.printf("La hipotenusa es: %.2f", hip);
    }
}
