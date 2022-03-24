package Bloque2;

import java.util.Scanner;

public class EjercicioMayor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A, B, C, Mayor = 0;

        System.out.println("Añade A: ");
        A = in.nextInt();
        System.out.println("Añade B: ");
        B = in.nextInt();
        System.out.println("Añade C: ");
        C = in.nextInt();

        if (A > B) {
            if (A > C) {
                Mayor = A;
            } else {
                Mayor = C;
            }
        } else {
            if (B > C) {
                Mayor = B;
            } else {
                Mayor = C;
            }

        }
        System.out.println("Mayor es " + Mayor);
    }
}
