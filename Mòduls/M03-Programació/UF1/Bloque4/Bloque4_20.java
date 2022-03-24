package Bloque4;

import java.util.Scanner;

public class Bloque4_20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner ina = new Scanner(System.in);
        boolean repe = true;
        int repes, años, cont = 0;

        while (repe == true) {
            System.out.println("Introduce el nombre del trabajador");
            String nombre = ina.nextLine();
           
            System.out.println("Cuantos años has estado trabajando aqui?");
            años = in.nextInt();

            if ((años >= 3) && (años < 10)) {
                System.out.println("Bonus de 300€");
            } else if ((años >= 10) && (años < 15)) {
                System.out.println("Bonus de 400€");
            } else {
                System.out.println("Bonus de 700€");
            }
            cont++;

            System.out.println("Quieres añadir otro trabajador?\n 1.Si \n 2.No");
            repes = in.nextInt();
            if (repes == 2) {
                repe = false;

            }
        }

        System.out.println("Has pagado un total de " + cont + " bonus");
    }
}
