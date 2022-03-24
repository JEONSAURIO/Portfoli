package Bloque2;

import java.util.Scanner;

public class Bloque2_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2;

        System.out.println("Añade primer número : ");
        n1 = in.nextInt();
        System.out.println("Añade segundo número : ");
        n2 = in.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " es mayor a " + n2);
        } else if (n1 < n2) {
            System.out.println(n2 + " es mayor a " + n1);
        } else {
            System.out.println("Son iguales");
        }
    }
}
