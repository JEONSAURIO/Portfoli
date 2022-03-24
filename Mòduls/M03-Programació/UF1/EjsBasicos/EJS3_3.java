package EjsBasicos;

import java.util.Scanner;

public class EJS3_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean salir = true;

        while (salir == true) {
            String opcion = in.nextLine().toLowerCase();

            switch (opcion) {
                case "c":
                    cilindro(in);
                    break;
                case "h":
                    hexaedro(in);
                    break;
                case "t":
                    tetraedro(in);
                    break;
                case "e":
                    esfera(in);
                    break;
                case "s":
                    salir = false;
                    break;
                default:
                    break;
            }

        }

    }

    public static void cilindro(Scanner in) {
        int radio = in.nextInt();
        int altura = in.nextInt();

        double area = (2 * Math.PI * (radio * altura));
        double volumen = (Math.PI * Math.pow(radio, 2) * altura);
        System.out.println("==Cilindre==");
        System.out.printf("Superfície: %.2f \n", area);
        System.out.printf("Volum: %.2f \n", volumen);
    }

    public static void hexaedro(Scanner in) {
        int alturaH = in.nextInt();

        double area = 6 * Math.pow(alturaH, 2);
        double volumen = Math.pow(alturaH, 3);
        System.out.println("==Hexaedre==");
        System.out.printf("Superfície: %.2f \n", area);
        System.out.printf("Volum: %.2f \n", volumen);
    }

    public static void tetraedro(Scanner in) {
        int alturaT = in.nextInt();

        double area = ((Math.sqrt(3))*Math.pow(alturaT,2));
        double volumen = (Math.sqrt(2)/12 * Math.pow(alturaT,2));
        System.out.println("==Tetraedre==");
        System.out.printf("Superfície: %.2f \n", area);
        System.out.printf("Volum: %.2f \n", volumen);

    }

    public static void esfera(Scanner in) {
        int radioE = in.nextInt();

        double area = (4 * Math.PI * Math.pow(radioE, 2));
        double volumen = ((4 * Math.PI * Math.pow(radioE, 3)) / 3);
        System.out.println("==Esfera==");
        System.out.printf("Superfície: %.2f \n", area);
        System.out.printf("Volum: %.2f \n", volumen);
    }
}
