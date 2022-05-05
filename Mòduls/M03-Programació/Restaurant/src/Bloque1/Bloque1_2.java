package Bloque1;

import java.util.Scanner;

public class Bloque1_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int opcion;
        boolean sortir = false;

        do {

            System.out.println("Escoge una opción :");
            System.out.println("1.Reserva Taula \n2.Carta \n3.Fes el compte \n4.Pla \"Clients fidels\" \n5.Receptari \n6.Inventari de cuina \n7.Sortir");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Opción : Reserva taula");
                    break;
                case 2:
                    System.out.println("Opción : Carta");
                    break;
                case 3:
                    System.out.println("Opción : Fes el compte");
                    break;
                case 4:
                    System.out.println("Opción : Pla \"Clients fidels\"");
                    break;
                case 5:
                    System.out.println("Opción : Receptari");
                    break;
                case 6:
                    System.out.println("Opción : Inventari de cuina");
                    break;
                case 7:
                    System.out.println("Opción : Sortir");
                    sortir = true;
                    break;
                default:
                    System.out.println("No es una opción válida");
                    break;
            }
        } while (sortir == false);
    }

}
