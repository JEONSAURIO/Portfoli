package Bloque2;

import java.util.Scanner;

public class EjercicioPorciento {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int precio, descuento;

        System.out.println("Añade Precio : ");
        precio = in.nextInt();

        if (precio > 10000) {
            descuento = ((precio / 100) * 10);
        } else {
            descuento = ((precio / 100) * 5);
        }
        precio = precio - descuento;
        System.out.println("El precio es " + precio + "€");
    }
}
