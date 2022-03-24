package Bloque3;

import java.util.Scanner;

public class Bloque3_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int salariA, augment;
        double salariF = 0;

        System.out.println("Que salario tiene?");
        salariA = in.nextInt();
        augment = salariA;
        if (salariA <= 9000) {
            salariF = salariA + (augment * 0.2);
        } else if (salariA <= 15000) {
            salariF = salariA + (augment * 0.1);
        } else if (salariA <= 20000) {
            salariF = salariA + (augment * 0.05);
        } else {
            salariF = salariA * 1;
        }
        System.out.println("Tiene un salario total de " + salariF + "€");
    }
}
