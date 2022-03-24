package Bloque3;

import java.util.Scanner;

public class Bloque3_ExAutoAvalprueba {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, j, evita;
        System.out.println("Introduce los nombres");
        String nombres = in.nextLine();

        String meñaño = nombres.replaceFirst("eva", "Eva");

        System.out.println(meñaño);
    }

}
