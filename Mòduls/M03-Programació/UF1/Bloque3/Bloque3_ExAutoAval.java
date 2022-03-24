package Bloque3;

import java.util.Scanner;

public class Bloque3_ExAutoAval {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        boolean evita = false;
        System.out.println("Introduce los nombres");
        String nombres = in.nextLine();

        for (i = 0; i < nombres.length(); i++) {
            if ((nombres.charAt(i) == 'e') && (nombres.charAt(i + 1) == 'v') && (nombres.charAt(i + 2) == 'a')) {
                if (i == 0) {
                    if (nombres.charAt(i + 3) == ' ') {
                        evita = true;
                    }
                } else if (i == (nombres.length() - 3)) {
                    if (nombres.charAt(i - 1) == ' ') {
                        evita = true;
                    }
                } else {
                    if ((nombres.charAt(i - 1) == ' ') && (nombres.charAt(i + 3) == ' ')) {
                        evita = true;
                    }

                }
                if (evita == true) {
                    nombres = nombres.substring(0, i) + "E" + nombres.substring(i + 1);
                    evita = false;
                }
            }
        }
        System.out.println(nombres);
    }
}
