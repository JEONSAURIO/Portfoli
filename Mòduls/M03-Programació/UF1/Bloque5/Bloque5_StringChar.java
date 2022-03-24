package Bloque5;

import java.util.Arrays;
import java.util.Scanner;

public class Bloque5_StringChar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String prueba = "Hola como estamos crack";

        char[] arraychar = new char[prueba.length()];
        arraychar = prueba.toCharArray();

        for (int i = 0; i < prueba.length(); i++) {
            System.out.println("Caracter " + arraychar[i]);
        }

        prueba = "Jeon; Roldan; 25/12/2003;Terrassa";
        String[] pruebastr = new String[4];
        pruebastr = prueba.split(";");
        for (int i = 0; i < pruebastr.length; i++) {
            System.out.println("campo " + pruebastr[i]);
        }

        int[] pruebaInt = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] pruebaInt2 = Arrays.copyOf(pruebaInt, pruebaInt.length);

        for (int i = 0; i < pruebaInt2.length; i++) {
            System.out.println(" " + pruebaInt2[i]);
        }

        int[] pruebaInt3 = new int[]{9, 8, 7, 6, 5, 4, 3};
        boolean iguals = Arrays.equals(pruebaInt, pruebaInt2);
        if (iguals == true) {
            System.out.println("Son iguals");
        }
        // o més elegant
        if (Arrays.equals(pruebaInt, pruebaInt2)) {
            System.out.println("Són iguals");
        } else {
            System.out.println("No són iguals");
        }

        int[] pruebaInt4 = Arrays.copyOf(pruebaInt, pruebaInt.length);

        Arrays.fill(pruebaInt4, 0);

        for (int i = 0; i < pruebaInt4.length; i++) {
            System.out.println(" " + pruebaInt4[i]);
        }

        System.out.println("");
        pruebaInt4 = Arrays.copyOf(pruebaInt, pruebaInt.length);

        Arrays.sort(pruebaInt4);
        for (int i = 0; i < pruebaInt4.length; i++) {
            System.out.println(" " + pruebaInt4[i]);
        }

        arraychar = new char[]{'h', 'o', 'l', 'a'};
        prueba = Arrays.toString(arraychar);
        System.out.println(arraychar);

        prueba = Arrays.toString(pruebaInt);
        System.out.println(prueba);
        System.out.println(prueba.length());
        System.out.println(prueba.charAt(1));

    }

}
