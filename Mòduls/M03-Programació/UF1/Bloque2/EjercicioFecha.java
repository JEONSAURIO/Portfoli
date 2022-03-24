package Bloque2;

import java.util.Scanner;

public class EjercicioFecha {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int AA, MA, DA, AN, MN, DN, Años;

        System.out.println("Año Actual : ");
        AA = in.nextInt();

        System.out.println("Mes Actual : ");
        MA = in.nextInt();

        System.out.println("Dia Actual : ");
        DA = in.nextInt();

        System.out.println("Año de tu Nacimiento : ");
        AN = in.nextInt();

        System.out.println("Mes de tu Nacimiento : ");
        MN = in.nextInt();

        System.out.println("Día de tu Nacimiento : ");
        DN = in.nextInt();

        Años = AA - AN;

        if (MA < MN) {
            Años = Años - 1;
        } else if ((MA == MN) && (DA < DN)) {
            Años = Años - 1;
        } else if ((MA == MN) && (DA == DN)) {
            System.out.print("Felicidades!! ");
        }
        System.out.println("Tienes " + Años + " años");
    }
}
