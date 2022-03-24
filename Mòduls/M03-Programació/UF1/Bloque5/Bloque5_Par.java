package Bloque5;

import java.util.Scanner;

public class Bloque5_Par {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pares = 0, impares = 0;
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Añade una nota");
            nums[i] = in.nextInt();

            if (nums[i] % 2 == 0) {
                pares += nums[i];
            } else {
                impares += nums[i];
            }
        }

        System.out.println("El total de la suma de los numeros pares es : " + pares);
        System.out.println("Y el total de la suma de los numeros impares es : " + impares);
    }

}
