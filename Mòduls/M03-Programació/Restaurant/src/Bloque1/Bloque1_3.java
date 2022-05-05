package Bloque1;

import java.util.Scanner;

public class Bloque1_3 {

    public static final double IVA = 0.05;
    public static final double DESCUENTO = 0.05;

    public static void main(String[] args) {

        login();

    }

    public static void login() {
        Scanner in = new Scanner(System.in);
        int intentos = 0;
        boolean ok = false;

        while ((ok == false) && (intentos < 3)) {
            System.out.println("Introduce el usuario");
            String usuario = in.nextLine();
            System.out.println("Introduce la contraseña");
            String contra = in.nextLine();

            if (("jeon".equals(usuario)) && ("hola".equals(contra))) {
                ok = true;
                System.out.println("Ok. Has entrado");
                System.out.println("Bienvenido " + usuario);
                menu();

            } else {
                System.out.println("Los datos no son correctos, vuelve a intentarlo");
                intentos++;
                if (intentos == 3) {
                    System.out.println("Se han acabado tus intentos, adios.");
                }
            }

        }

    }

    public static void menu() {
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
                    hazCuenta();
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

    public static void hazCuenta() {
        Scanner in = new Scanner(System.in);
        double precioNormal = 0, precioIva, precioPlatos = 1, precioFiel;
        int fiel;

        while (precioPlatos != 0) {
            System.out.println("Añade el precio de un plato");
            precioPlatos = in.nextDouble();

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
