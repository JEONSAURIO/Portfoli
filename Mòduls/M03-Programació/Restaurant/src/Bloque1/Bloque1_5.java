package Bloque1;

import java.util.Scanner;

public class Bloque1_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int min1, min2, min3, cant1, cant2, cant3;

        System.out.println("Introduce el primer producto");
        String prod1 = in.nextLine();
        System.out.println("Introduce el segundo producto");
        String prod2 = in.nextLine();
        System.out.println("Introduce el tercer producto");
        String prod3 = in.nextLine();

        System.out.println("La cantidad mínima de " + prod1);
        min1 = in.nextInt();
        System.out.println("Cantidad total de " + prod1);
        cant1 = in.nextInt();

        if (cant1 < min1) {
            System.out.println("Faltan " + (min1 - cant1) + " unidades de " + prod1 + "\nDebes comprar más.");
        } else {
            System.out.println("Sobran " + (cant1 - min1) + " unidades de " + prod1);
        }

        System.out.println("La cantidad mínima de " + prod2);
        min2 = in.nextInt();
        System.out.println("Cantidad total de " + prod2);
        cant2 = in.nextInt();

        if (cant2 < min2) {
            System.out.println("Faltan " + (min2 - cant2) + " unidades de " + prod2 + "\nDebes comprar más.");
        } else {
            System.out.println("Sobran " + (cant2 - min2) + " unidades de " + prod2);
        }

        System.out.println("La cantidad mínima de " + prod3);
        min3 = in.nextInt();
        System.out.println("Cantidad total de " + prod3);
        cant3 = in.nextInt();

        if (cant3 < min3) {
            System.out.println("Faltan " + (min3 - cant3) + " unidades de " + prod3 + "\nDebes comprar más.");
        } else {
            System.out.println("Sobran " + (cant3 - min3) + " unidades de " + prod3);
        }

    }
}
