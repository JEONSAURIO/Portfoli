package EjsBasicos;

import java.util.Scanner;

public class EJS4_1 {

    public static final int LARGO = 10;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[LARGO];
        for (int i = 0; i < LARGO; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        int[] b = new int[LARGO];
        for (int i = 0; i < LARGO; i++) {
            b[i] = (int) (Math.random() * (999 - 100)) + 100;
        }
        int[] c = new int[2 * LARGO];
        for (int i = 0; i < 2 * LARGO; i++) {
            if (i % 2 == 0) {
                c[i] = a[i / 2];
            } else {
                c[i] = b[i / 2];
            }
        }

        System.out.print("A[] = ");
        for (int i = 0; i < LARGO; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("B[] = ");
        for (int i = 0; i < LARGO; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

         System.out.print("C[] = ");
        for (int i = 0; i < 2 * LARGO; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

    }
}
