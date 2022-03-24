package Bloque3;

import java.util.Scanner;

public class Bloque3_21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, j;
        boolean palindrom = true;

        System.out.println("Cadena:");
        String cadena = in.nextLine();

        j = cadena.length() - 1;

        while ((i < j) && (palindrom == true)) {
            if (cadena.charAt(i) == ' ') {
                i++;
            }
            if (cadena.charAt(j) == ' ') {
                j--;
            }

            if (cadena.charAt(i) != cadena.charAt(j)) {
                palindrom = false;
            }
            i++;
            j--;
        }
        if (palindrom == true) {
            System.out.println("És palíndrom");
        } else {
            System.out.println("No és palíndrom");
        }
    }

}
