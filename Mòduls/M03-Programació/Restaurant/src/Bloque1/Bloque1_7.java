package Bloque1;

import java.util.Scanner;

public class Bloque1_7 {

    public static final double PAN = 1.00;
    public static final double POLLO = 7.50;
    public static final double NESTEA = 3.50;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String producto1 = "pan";
        String producto2 = "pollo";
        String producto3 = "nestea";

        System.out.println("Introducir productos");
        String productos = in.nextLine().toLowerCase();

        productos = productos + " ";
        String producto = "";

        double cuenta = 0;

        for (int i = 0; i < productos.length(); i++) {
            if (productos.charAt(i) != ' ') {
                producto = producto + productos.charAt(i);
            } else {
                if (producto1.equals(producto)) {
                    cuenta += PAN;
                } else if (producto2.equals(producto)) {
                    cuenta += POLLO;
                } else if (producto3.equals(producto)) {
                    cuenta += NESTEA;
                } else {
                    System.out.println("No se reconoce el producto " + producto);
                }
                producto = "";
            }
        }
        System.out.printf("El total es de : %.2f€ \n", cuenta);

    }

}
