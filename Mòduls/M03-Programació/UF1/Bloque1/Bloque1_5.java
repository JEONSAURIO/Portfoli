package Bloque1;

import java.util.Scanner;

public class Bloque1_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, div;

        System.out.println("Primer Número");
        n1 = in.nextInt();
        System.out.println("Segundo Número");
        n2 = in.nextInt();

        div = n1 % n2;

        System.out.println("La división es: " + div);
    }
}


   
