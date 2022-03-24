package EjsBasicos;

import java.util.Scanner;

public class EJS3_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean salir = true;

        while (salir == true) {
            String opcion = in.nextLine().toLowerCase();
            switch (opcion) {
                case "r":
                    rectangle(in);
                    break;
                case "q":
                    quadrat(in);
                    break;
                case "t":
                    Tisosceles(in);
                    break;
                case "c":
                    cercle(in);
                    break;
                case "s":
                    salir = false;
                    break;
                default:
                    break;
            }
        }

    }

    public static void rectangle(Scanner in) {
        double base = in.nextDouble();
        double altura = in.nextDouble();
        System.out.println("==Rectangle==");
        System.out.printf("Perímetre : %.2f \n", ((base + altura) * 2));
        System.out.printf("Superfície: %.2f \n", (base * altura));

    }

    public static void quadrat(Scanner in) {
        double lado = in.nextDouble();
        System.out.println("==Quadrat==");
        System.out.printf("Perímetre : %.2f \n", (lado * 4));
        System.out.printf("Superfície: %.2f \n", (lado * lado));
    }

    public static void Tisosceles(Scanner in) {
        double ladoT = in.nextDouble();
        double baseT = in.nextDouble();

        double alturaT;
        alturaT = (baseT * Math.sqrt((Math.pow(ladoT, 2) - (Math.pow(baseT, 2) / 4)))) / 2;
        System.out.println("==Triangle isòsceles==");
        System.out.printf("Perímetre : %.2f \n", (baseT + (ladoT + ladoT)));
        System.out.printf("Superfície: %.2f \n", alturaT);
    }

    public static void cercle(Scanner in) {
        double radio = in.nextDouble();

        double resultado = (2 * Math.PI * radio);
        System.out.println("==Cercle==");
        System.out.printf("Perímetre : %.2f \n", resultado);
        System.out.printf("Superfície: %.2f \n", (Math.PI * (radio * radio)));

    }
}
