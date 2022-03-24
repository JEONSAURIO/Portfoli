package Bloque2;

import java.util.Scanner;

public class Bloque2_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1;

        System.out.println("Añade número : ");
        n1 = in.nextInt();

        if (n1 == 0) {
            System.out.println("El número es 0");
        } else {
            System.out.println("Nothing");
        }
    }
}
