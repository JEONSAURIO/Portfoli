package Bloque1;

import java.util.Scanner;

public class Bloque1_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, multi;

        System.out.println("Primer Número");
        n1 = in.nextInt();
        System.out.println("Segundo Número");
        n2 = in.nextInt();

        multi = n1 * n2;
        System.out.println("La multiplicacion es: " + multi);
    }
}
