package Bloque2;

import java.util.Scanner;

public class Bloque2_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1;

        System.out.println("Añade número : ");
        n1 = in.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("Número es par");
        } else {
            System.out.println("Número impar");
        }
    }
}
