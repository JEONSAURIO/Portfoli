package Bloque3;

import java.util.Scanner;

public class Bloque3_Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, resultado = 1, cont;

        System.out.println("Añade numero");
        num = in.nextInt();

        for (cont = 1; cont <= num; cont++) {
            resultado = cont * resultado;
        }
        System.out.println("El factorial es " + resultado);
        System.out.println("El ultimo dígito es " + (resultado % 10));
    }
}
