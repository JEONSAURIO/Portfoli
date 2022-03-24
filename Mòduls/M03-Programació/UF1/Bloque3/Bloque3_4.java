package Bloque3;

import java.util.Scanner;

public class Bloque3_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hor, min, seg;

        System.out.println("Dame una hora: ");
        hor = in.nextInt();

        System.out.println("Dame los minutos: ");
        min = in.nextInt();

        System.out.println("Dame los segundos: ");
        seg = in.nextInt();

        seg++;

        if (seg == 60) {
            seg = 0;
            min++;
        }
        if (min == 60) {
            min = 0;
            hor++;
        }
        System.out.printf("Son %d hores, %d minuts i %d segons", hor, min, seg);
    }
}
