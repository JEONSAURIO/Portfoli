package Bloque3;

import java.util.Scanner;

public class Bloque3_22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, j;
        boolean arroba = false;
        System.out.println("Escribe tu correo: ");
        String correo = in.nextLine();

        j = correo.length();

        while ((arroba = false) && (i < j)) {
            if (correo.charAt(i) == '@') {
                arroba = true;
            }
            i++;
        }
        if (arroba = true) {
            System.out.println("Tiene una arroba");
        } else {
            System.out.println("No tiene arroba");
        }

    }

}
