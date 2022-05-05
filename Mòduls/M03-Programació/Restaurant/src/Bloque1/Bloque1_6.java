package Bloque1;

import java.util.Scanner;

public class Bloque1_6 {

    public static final double IVA = 0.05;
    public static final double DESCUENTO = 0.05;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double precioNormal = 0, precioIva, precioPlatos = 1, precioFiel;
        int fiel, cant;

        while (precioPlatos != 0) {
            System.out.println("Añade el precio de un plato");
            precioPlatos = in.nextDouble();

            System.out.println("Cantidad del producto?");
            cant = in.nextInt();
            precioPlatos = precioPlatos * cant;

            precioNormal = precioNormal + precioPlatos;

        }
        System.out.println("Eres un cliente fiel? \n1.Si \n2.No");
        fiel = in.nextInt();

        switch (fiel) {
            case 1:
                precioFiel = precioNormal * (1 - DESCUENTO);
                precioIva = precioFiel * (1 + IVA);
                System.out.println("El precio sin IVA es " + precioFiel + " y el precio con IVA es " + precioIva);
                break;
            case 2:
                precioIva = precioNormal + (1 + IVA);
                System.out.println("El precio sin IVA es " + precioNormal + " y el precio con IVA es " + precioIva);
                break;
        }
    }
}
