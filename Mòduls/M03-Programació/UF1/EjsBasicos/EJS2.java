package EjsBasicos;

import java.util.Scanner;
import java.lang.Math;

public class EJS2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        menu(in);
        
        int[][] matriu = new int[5][5];
    }

    public static void menu(Scanner in) {
        System.out.println("Escoge una opción : \n 1. Calculadora \n 2. Areas y perimetros de figuras 2d \n 3. Areas y volumen de figuras 3d \n 4. Salir");
        int opcion = in.nextInt();

        switch (opcion) {
            case 1:
                calculadora(in);
                break;
            case 2:
                figuras2d(in);
                break;
            case 3:
                figuras3d(in);
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    public static void calculadora(Scanner in) {
        System.out.println("Añade el primer numero :");
        int opcion1 = in.nextInt();
        System.out.println("Añade el segundo numero : ");
        int opcion2 = in.nextInt();

        System.out.println("Qué te gustaría hacer? \n 1. Suma \n 2. Resta \n 3. Multiplicación \n 4. División");
        int eleccion = in.nextInt();

        switch (eleccion) {
            case 1:
                System.out.println("La suma es : " + (opcion1 + opcion2));
                break;
            case 2:
                System.out.println("La resta es : " + (opcion1 - opcion2));
                break;
            case 3:
                System.out.println("La multiplicacion es : " + (opcion1 * opcion2));
                break;
            case 4:
                System.out.println("La division es : " + (opcion1 / opcion2));
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    public static void figuras2d(Scanner in) {
        System.out.println("Qué tipo de figura necesitas? \n 1. Rectangulo \n 2. Cuadrado \n 3. Triangulo Isósceles \n 4. Circulo");
        int opcion = in.nextInt();

        switch (opcion) {
            case 1:
                rectangulo(in);
                break;
            case 2:
                cuadrado(in);
                break;
            case 3:
                isosceles(in);
                break;
            case 4:
                circulo(in);
                break;
            default:
                System.out.println("Opción no válida");
                break;

        }
    }

    public static void rectangulo(Scanner in) {
        System.out.println("Añade la medida de la base :");
        int base = in.nextInt();
        System.out.println("Añade la altura : ");
        int altura = in.nextInt();

        System.out.println("El perimetro es : " + ((base + altura) * 2));
        System.out.println("El área es : " + (base * altura));

    }

    public static void cuadrado(Scanner in) {
        System.out.println("Añade la medida de un lado :");
        int lado = in.nextInt();

        System.out.println("El perimetro es : " + (lado * 4));
        System.out.println("El area es : " + (lado * lado));
    }

    public static void isosceles(Scanner in) {
        System.out.println("Añade la medida de la base : ");
        int baseT = in.nextInt();
        System.out.println("Añade la medida de un lado : ");
        int ladoT = in.nextInt();
        System.out.println("Añade la altura : ");
        int alturaT = in.nextInt();

        System.out.println("El perimetro es :" + ((ladoT + ladoT) + baseT));
        System.out.println("El área es : " + ((baseT * alturaT) / 2));
    }

    public static void circulo(Scanner in) {
        System.out.println("Añade radio : ");
        int radio = in.nextInt();

        double resultado = (2 * Math.PI * radio);

        System.out.println("El perimetro es : " + resultado);
        System.out.println("El area es : " + (Math.PI * (radio * radio)));
    }

    public static void figuras3d(Scanner in) {
        System.out.println("Qué tipo de figura necesitas? \n 1. Cilindro \n 2. Hexaedro \n 3. Tetraeedro \n 4. Esfera");
        int opcion = in.nextInt();

        switch (opcion) {
            case 1:
                cilindro(in);
                break;
            case 2:
                hexaedro(in);
                break;
            case 3:
                tetraedro(in);
                break;
            case 4:
                esfera(in);
                break;
            default:
                System.out.println("Opción no válida");
                break;

        }
    }

    public static void cilindro(Scanner in) {
        System.out.println("Añade la altura : ");
        int altura = in.nextInt();
        System.out.println("Añade radio : ");
        int radio = in.nextInt();

        double area = ((Math.PI * 2) * radio * (altura + radio));
        double volumen = (Math.PI * (radio * radio) * altura);
        System.out.printf("El área es : %.2f", area);
        System.out.printf("El volumen es : %.2f", volumen);
    }

    public static void hexaedro(Scanner in) {
        System.out.println("Añade la altura : ");
        int alturaH = in.nextInt();

        double area = 6 * (alturaH * alturaH);
        double volumen = alturaH * alturaH * alturaH;
        System.out.printf("El área es : %.2f", area);
        System.out.printf("El volumen es : %.2f", volumen);
    }

    public static void tetraedro(Scanner in) {
        System.out.println("Añade la altura : ");
        int alturaT = in.nextInt();

        double area = Math.sqrt(Math.pow(alturaT, 2) * 3);
        double volumen = Math.sqrt((Math.pow(alturaT, 2) * 2) / 12);
        System.out.printf("El área es : %.2f", area);
        System.out.printf("El volumen es : %.2f", volumen);

    }

    public static void esfera(Scanner in) {
        System.out.println("Añade radio : ");
        int radioE = in.nextInt();

        double area = (3 * Math.PI * Math.pow(radioE, 2));
        double volumen = (2 * Math.PI * Math.pow(radioE, 3) / 3);
        System.out.printf("El área es : %.2f", area);
        System.out.printf("El volumen es : %.2f", volumen);
    }

}
