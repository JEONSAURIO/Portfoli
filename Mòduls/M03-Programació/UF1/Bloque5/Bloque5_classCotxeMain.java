package Bloque5;

import java.util.Scanner;

public class Bloque5_classCotxeMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);
        classCotxe[] concessionari = new classCotxe[3];

        for (int i = 0; i < concessionari.length; i++) {
            System.out.println("Introducir marca: ");
            String marca = in.nextLine();

            System.out.println("Introducir modelo: ");
            String modelo = in.nextLine();

            System.out.println("Introducir potencia: ");
            int potencia = inNum.nextInt();

            System.out.println("Introducir electrico: ");
            boolean electrico = inNum.nextBoolean();

            concessionari[i] = new classCotxe(marca, modelo, potencia, electrico);
        }
        imprime(concessionari);
        System.out.println("La potencia mediana es: " + PotenciaMed(concessionari));
        System.out.println("Hay " + ContElec(concessionari) + " vehículos no eléctricos");
        IncrementaPotencia(10, concessionari);
    }

    public static void imprime(classCotxe[] taller) {
        System.out.println("Imprime el array");
        for (int i = 0; i < taller.length; i++) {
            taller[i].imprime();
        }

    }

    public static double PotenciaMed(classCotxe[] taller) {
        int sumaPot = 0;
        for (int i = 0; i < taller.length; i++) {
            sumaPot +=taller[i].getPotencia();
        }
        double mitjana = (float) sumaPot / taller.length;
        return mitjana;
    }

    public static int ContElec(classCotxe[] taller) {
        int contNE = 0;
        for (int i = 0; i < taller.length; i++) {
            if (taller[i].isElectric() == false) {
                contNE++;
            }
        }
        return contNE;
    }
    public static void IncrementaPotencia(int incremento, classCotxe[] taller){
         for (int i = 0; i < taller.length; i++) {
             taller[i].aumentaPotencia(incremento);
         }
        
    }

}
