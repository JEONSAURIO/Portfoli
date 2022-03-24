package Bloque3;

import java.util.Scanner;

public class Bloque3_6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, suma = 0;

        while (i <= 100) {
            suma = suma + i;
            i++;
        }
        System.out.println("resultat es : " + suma);

    }

}
