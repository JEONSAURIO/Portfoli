package Bloque3;

import java.util.Scanner;

public class Bloque3_23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escribe una frase: ");
        String frase = in.nextLine();

        System.out.println(frase.replace(' ', '\n'));

    }

}
