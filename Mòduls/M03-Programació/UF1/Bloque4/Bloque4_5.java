package Bloque4;

import java.util.Scanner;

public class Bloque4_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int suma = 0, multi = 1;
        for (int i = 0; i < 20; i++) {

            if (i % 2 == 0) {
                suma += i;
            }
            if (i % 2 == 1) {
                multi *= i;
            }

        }
        System.out.println("La suma de los numeros pares es " + suma);
        System.out.println("La multiplicacion de los numeros impares " + multi);
    }

}
