package Bloque2;

import java.util.Scanner;

public class EjercicioMenu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion, num1, num2, suma, resta, mult, division;

        System.out.println("Añade el primer número");
        num1 = in.nextInt();
        System.out.println("Añade el segundo número");
        num2 = in.nextInt();

        System.out.println("Escoge una opción");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.División");
        opcion = in.nextInt();

        if (opcion == 1) {
            suma = num1 + num2;
            System.out.println("El resultado es: " + suma);
        } else if (opcion == 2) {
            resta = num1 - num2;
            System.out.println("El resultado es: " + resta);
        } else if (opcion == 3) {
            mult = num1 % num2;
            System.out.println("El resultado es: " + mult);
        } else if (opcion == 4) {
            division = num1 / num2;
            System.out.println("El resultado es: " + division);
        } else {
            System.out.println("Opción no válida");
        }
    }
}
