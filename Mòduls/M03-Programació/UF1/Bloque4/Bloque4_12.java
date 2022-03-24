package Bloque4;

import java.util.Scanner;

public class Bloque4_12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int j = 10; j >= 6; j--) {
            for (int i = j; i >= 0; i--) {
                if (i == 0) {
                    System.out.printf("%d \n", i);
                }
                if (i != 0) {
                    System.out.printf("%d", i);
                }

            }
        }
    }

}
