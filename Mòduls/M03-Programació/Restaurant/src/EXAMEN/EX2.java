package EXAMEN;

import java.util.Scanner;

public class EX2 {

    public static final int ESTACIONES = 10;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        EX2class[] estacion = new EX2class[ESTACIONES];

        estacion[0] = new EX2class("España", "Narnia", 24, 50);
        estacion[1] = new EX2class("Francia", "Baguette", 20, 40);
        estacion[2] = new EX2class("Alemania", "Babia", 14, 30);
        estacion[3] = new EX2class("Italia", "Elmort", 23, 55);
        estacion[4] = new EX2class("Alemania", "Springfield", 7, 61);
        estacion[5] = new EX2class("Suecia", "Yuki", 10, 47);
        estacion[6] = new EX2class("Rusia", "Suka", 1, 39);
        estacion[7] = new EX2class("España", "Marktuan", 21, 42);
        estacion[8] = new EX2class("Francia", "Maplecar", 3, 68);
        estacion[9] = new EX2class("Alemania", "Tacos", 30, 53);

        paisTempA(estacion, in);
        numEst(estacion);
    }

    public static void paisTempA(EX2class[] estacion, Scanner in) {
        int paisTemp = 0;

        for (int i = 0; i < ESTACIONES; i++) {
            if (estacion[i].getTemperatura() > paisTemp) {
                paisTemp = i;
            }
        }
        System.out.println("El pais con la temperatura mas alta es : " + estacion[paisTemp].getPais() + " y su región " + estacion[paisTemp].getRegion());
    }

    public static void numEst(EX2class[] estacion) {
        int cont = 0;

        for (int i = 0; i < ESTACIONES; i++) {
            String pais = estacion[i].getPais();
            cont = 0;
            for (int j = 0; j < ESTACIONES; j++) {
                if (estacion[j].getPais().equals(pais)) {
                    cont++;
                }

            }
            System.out.println("En " + pais + " hay " + cont + " estaciones.");
        }

    }

    public static void nuevainfo(EX2class[] estacion, Scanner in) {
        System.out.println("");
    }
}
