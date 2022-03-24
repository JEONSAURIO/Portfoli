package Bloque2;

import java.util.Scanner;

public class EjercicioSegundos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int seg, min, hor, dia, año, segS, minS, horS, diaS;

        System.out.println("Añade segundos: ");
        seg = in.nextInt();

        min = seg / 60;
        segS = seg % 60;

        hor = min / 60;
        minS = min % 60;

        dia = hor / 24;
        horS = hor % 24;

        año = dia / 365;
        diaS = dia % 365;

        System.out.printf("%d segundos son %d años, %d dias, %d horas, %d minutos y %d segundos", seg, año, diaS, horS, minS, segS);
    }
}
