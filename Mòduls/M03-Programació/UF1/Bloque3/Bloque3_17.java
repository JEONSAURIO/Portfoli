package Bloque3;

import java.util.Scanner;

public class Bloque3_17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase;
        int cont = 0;
        System.out.println("Escribe una frase");
        frase = in.nextLine();

        for (int i = frase.length() - 1; i >= 0; i--) {
            if (frase.charAt(i) == 'a') {
                cont++;
            }

        }
        System.out.println("Aparece " + cont + " veces");
    }
}
