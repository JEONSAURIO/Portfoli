package Bloque5;

import java.util.Scanner;

public class Bloque5_ArrayBi3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;
        int[][] bid = new int[5][5];

        for (int i = 0; i < bid.length; i++) {
            for (int j = 0; j < bid[i].length; j++) {
                if ((i == 0) || (i == 4)) {
                    bid[i][j] = num;
                } else if ((j == 0) || (j == 4)) {

                    bid[i][j] = num;
                }

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
