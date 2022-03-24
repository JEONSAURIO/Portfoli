package Bloque1;

import java.util.Scanner;
import java.lang.Math;

public class Bloque1_8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radio, resultado;

        System.out.println("Añade radio : ");
        radio = in.nextDouble();

        resultado = 2 * Math.PI * radio;

        System.out.printf("La circumferencia es: %.2f", resultado);
    }
}
