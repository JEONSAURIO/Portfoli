package Bloque5;

import java.util.Scanner;

public class Bloque5_PruebaClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);

        classCotxe meuCotxe = new classCotxe();
        meuCotxe.setMarca("Kia");
        meuCotxe.setModel("Sportage");
        meuCotxe.setPotencia(100);
        meuCotxe.setElectric(true);

        meuCotxe.imprime();

        System.out.println("Intro marca: ");
        String marca = in.nextLine();

        System.out.println("Intro model: ");
        String model = in.nextLine();

        System.out.println("Intro potencia: ");
        int potencia = inNum.nextInt();

        System.out.println("Intro electric: ");
        boolean electric = in.nextBoolean();

        classCotxe teuCotxe = new classCotxe(marca, model, potencia, electric);
        teuCotxe.imprime();

        System.out.println("La nueva potencia es : " + teuCotxe.aumentaPotencia(25));

    }

}
