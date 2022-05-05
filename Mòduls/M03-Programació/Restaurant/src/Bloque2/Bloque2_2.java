package Bloque2;

import java.util.Scanner;

public class Bloque2_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner ins = new Scanner(System.in);
        int min = 0, max = 0;
        float porcentaje = 0, platos = 0;
        String platoExito = "";
        String Minimo = "";
        int[] cantidad = new int[5];
        String[] producto = new String[5];

        for (int i = 0; i < producto.length; i++) {
            System.out.println("Añade plato");
            producto[i] = ins.nextLine();

            System.out.println("Añade cantidad");
            cantidad[i] = in.nextInt();
            if (i == 0) {
                max = i;
                min = i;
            }

            if (cantidad[i] > max) {
                max = i;
            }

            if (cantidad[i] < min) {
                min = i;
            }

            platos += cantidad[i];

        }
        porcentaje = ((float) cantidad[max] / platos) * 100;

        System.out.println("El plato más exitoso es " + producto[max] + " con una cantidad de ventas de " + cantidad[max]);
        System.out.println("El plato con menos ventas es " + producto[min] + " con una cantidad de ventas de " + cantidad[min]);
        System.out.println("El total servido es de " + platos + " platos");
        System.out.println("El porcentaje del plato más exitoso es de " + porcentaje + "%");

    }
}
