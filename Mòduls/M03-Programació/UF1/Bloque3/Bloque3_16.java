package Bloque3;

import java.util.Scanner;

public class Bloque3_16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase = "Hola como estás?";

        System.out.println(frase);
        for (int i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
        System.out.println("");
    }
}
