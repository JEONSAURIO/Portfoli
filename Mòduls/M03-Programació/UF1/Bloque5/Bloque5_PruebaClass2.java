package Bloque5;

import java.util.Scanner;

public class Bloque5_PruebaClass2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);

        classCotxe[] concessionari = new classCotxe[3];

        for (int i = 0; i < concessionari.length; i++) {
            System.out.println("Intro marca: ");
            String marca = in.nextLine();

            System.out.println("Intro model: ");
            String model = in.nextLine();

            System.out.println("Intro potencia: ");
            int potencia = inNum.nextInt();

            System.out.println("Intro electric: ");
            boolean electric = inNum.nextBoolean();

            concessionari[i] = new classCotxe(marca, model, potencia, electric);

        }
        imprime(concessionari);
        mediaPot(concessionari);
        contEl(concessionari);
    }

    public static void imprime(classCotxe[] cotxes) {
        System.out.println("Resultat del taller");
        for (int i = 0; i < cotxes.length; i++) {
            cotxes[i].imprime();
        }
    }

    public static void mediaPot(classCotxe[] cotxes) {
        int sumaPot = 0;
        for (int i = 0; i < cotxes.length; i++) {
            sumaPot += cotxes[i].getPotencia();
        }
        double mitjanaPot = (float) sumaPot / cotxes.length;
        System.out.println("La potencia media es: " + mitjanaPot);
    }

    public static void contEl(classCotxe[] cotxes) {
        int sumaElectrics = 0;
        for (int i = 0; i < cotxes.length; i++) {
            if (cotxes[i].isElectric()) {
                sumaElectrics++;
            }

        }
        System.out.println("Electrics: " + sumaElectrics);

    }

    public static classCotxe potenciaSuperior(classCotxe[] cotxes) {
        int max = 0;
        int potMax = cotxes[0].getPotencia();
        for (int i = 1; i < cotxes.length; i++) {
            if (cotxes[i].getPotencia() > potMax) {
                max = i;
                potMax = cotxes[i].getPotencia();
            }
        }
        return cotxes[max];
    }
}
