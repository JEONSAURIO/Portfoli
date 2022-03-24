package Bloque5;

import java.util.Scanner;

public class Bloque5_32 {

    public static final int Vendedor = 5;
    public static final int Producto = 10;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] elementos = new int[Vendedor][Producto];
        double [] precio = new double[Producto];
        int suma = 0, max = 0, maxVendedor = 0;

        /*Parte 1 del ejercicio 32*/
        for (int i = 0; i < Vendedor; i++) {
            for (int j = 0; j < Producto; j++) {
                elementos[i][j] = (int) (Math.random() * 10);
                System.out.print(elementos[i][j] + " ");
            }
            System.out.println(" ");
        }

        for (int j = 0; j < Producto; j++) {
            precio[j] = (int) (Math.random() * 5);
            System.out.printf("%.2f ",precio[j]);
        }
        System.out.println(" ");

        for (int i = 0; i < Vendedor; i++) {
            suma = 0;
            for (int j = 0; j < Producto; j++) {
                suma += elementos[i][j] * precio[j];
            }
            System.out.println("Vendedor " + i + " : " + suma);
            if (suma > max) {
                max = suma;
                maxVendedor = i;
            }
        }
        System.out.println("El vendedor con más ventas es el " + maxVendedor);

        /*Parte 2 del ejercicio 32*/
        int caro = 0, producto = 0, precioC = 0;
        double precioCaro = precio[0];
        for (int j = 0; j < Producto; j++) {
            if (precio[j] > precioCaro) {
                caro = j;
                precioCaro = precio[j];
            }
        }
        /*Parte 3 del ejercicio 32*/
        int productos = 0;
        System.out.println("Producto :");
        productos = in.nextInt();
        suma = 0;
        for (int i = 0; i < Vendedor; i++) {
            suma += elementos[i][productos] * precio[productos];
        }
               System.out.println("Suma " + suma);
    }

}
