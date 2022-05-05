package Examen;

import java.util.Scanner;

public class Examen_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*recogemos los datos*/
        System.out.println("Introduce un nombre de 8 cifras");
        String cifras = in.nextLine();
        int numInt, suma = 0;
        cifras = cifras + " ";
        String numeros = "";

        for (int i = 0; i < cifras.length(); i++) {
            numeros = numeros + cifras.charAt(i);

            numInt = Integer.parseInt(numeros);

            suma += numInt;

            numeros = "";
        }
        System.out.println(suma);
    }
}
