package EjsBasicos;

import java.util.Scanner;

public class EJS3_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opcion;
        boolean salir = true;
        int a, b;
        while (salir) {
            if (in.hasNextInt()) {
                a = in.nextInt();
                b = in.nextInt();
                in.nextLine();
                opcion = in.nextLine();
                calculadora(a, b, opcion);
            } else if (in.nextLine().equals("S")) {
                salir = false;
            }
        }
    }

    public static void calculadora(int a, int b, String opcion) {

        switch (opcion) {
            case "+":
                suma(a, b);
                break;
            case "-":
                resta(a, b);
                break;
            case "x":
                multi(a, b);
                break;
            case "/":
                dividir(a, b);
                break;
            default:
                break;
        }
    }

    public static void suma(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void resta(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public static void multi(int a, int b) {
        System.out.println(a + " x " + b + " = " + (a * b));
    }

    public static void dividir(int a, int b) {
        if (b == 0) {
            System.out.println("No es pot dividir per 0.");
        } else {
            System.out.println(a + " / " + b + " = " + (a / b));
        }
    }
}
