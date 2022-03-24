package Bloque5;

import java.util.Scanner;

public class Bloque5_ArrayBi {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;
        int[][] bid = new int[4][3];

        for (int i = 0; i < bid.length; i++) {
            for (int j = 0; j < bid[i].length; j++) {

                bid[i][j] = num;
                num *= 2;
            }
        }
        for (int i = 0; i < bid.length; i++) {
            for (int j = 0; j < bid[i].length; j++) {
                System.out.print(bid[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
