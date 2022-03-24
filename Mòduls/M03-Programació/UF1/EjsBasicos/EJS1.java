
package EjsBasicos;

import java.util.Scanner;


public class EJS1 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Holamundo();
        Suma(in);
        Mayorque0(in);
        entrenum(in);
    }

    public static void Holamundo() {
        System.out.println("Hola mundo!!");
    }

    public static void Suma(Scanner in) {
        System.out.println("Añade un número");
        int primero = in.nextInt();
        System.out.println("Añade un segundo numero");
        int segundo = in.nextInt();

        System.out.println("La suma de los dos es: " + (primero + segundo));

    }

    public static void Mayorque0(Scanner in) {
        System.out.println("Añade un número");
        int num = in.nextInt();

        if (num < 0) {
            System.out.println("Es menor a 0");
        } else if (num > 0) {
            System.out.println("Es mayor a 0");
        } else {
            System.out.println("Es igual a 0");
        }
    }

    public static void entrenum(Scanner in) {
        System.out.println("Añade un número");
        int pri = in.nextInt();
        System.out.println("Añade un segundo numero");
        int seg = in.nextInt();

        int numerorandom = (int) (Math.random() * (seg - pri)) + pri;

        System.out.println("El numero aleatorio es " + numerorandom);
    }
}


