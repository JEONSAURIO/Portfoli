package m03;

import java.util.Scanner;

public class M03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, suma;

        System.out.println("Primer Número");
        n1 = in.nextInt();
        System.out.println("Segundo Número");
        n2 = in.nextInt();

        suma = n1 + n2;
        System.out.println("La suma es: " + suma);

    }

}
