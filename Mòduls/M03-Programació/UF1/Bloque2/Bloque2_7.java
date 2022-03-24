package Bloque2;

import java.util.Scanner;

public class Bloque2_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1;

        System.out.println("Añade un número : ");
        n1 = in.nextInt();

        if ((n1 % 2 == 0) && (n1 % 3 == 0)) {
            System.out.println("Es multiplo de 2 y 3");
        } else if (n1 % 2 == 0) {
            System.out.println("Es multiplo de 2");
        } else if (n1 % 3 == 0) {
            System.out.println("Es multiplo de 3");
        } else {
            System.out.println("No es multiplo de 2 ni de 3");
        }
    }
}
