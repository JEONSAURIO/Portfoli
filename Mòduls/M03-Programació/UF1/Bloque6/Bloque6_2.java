package Bloque6;

import java.util.Scanner;

public class Bloque6_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inSec = new Scanner(System.in);

        classLibro[] libros = new classLibro[2];
        int numLib;
        double precio;

        for (int i = 0; i < libros.length; i++) {
            System.out.println("Introduce ISBN : ");
            String ISBN = inSec.nextLine();

            System.out.println("Introduce titulo : ");
            String titulo = inSec.nextLine();

            System.out.println("Introduce autor : ");
            String autor = inSec.nextLine();

            System.out.println("Introduce editorial : ");
            String editorial = inSec.nextLine();

            System.out.println("Introduce el numero de libros en la tienda : ");
            numLib = in.nextInt();

            System.out.println("Introduce precio : ");
            precio = in.nextDouble();

            libros[i] = new classLibro(ISBN, titulo, autor, editorial, numLib, precio);
        }
        imprime(libros);
        System.out.println("El precio del inventario en total es: " + inventario(libros));
        String autorFind = null;
        autorFind(autorFind, libros);
    }

    public static void imprime(classLibro[] lib) {
        System.out.println("Imprime el array");
        for (int i = 0; i < lib.length; i++) {
            lib[i].imprime();
        }

    }

    public static double inventario(classLibro[] inv) {
        double multi = 0;
        for (int i = 0; i < inv.length; i++) {
            multi = multi + (inv[i].getPrecio() * inv[i].getNumLib());

        }
        return multi;
    }

    public static void autorFind(String autor, classLibro[] libro) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < libro.length; i++) {
            if (libro[i].getAutor().equals(autor)) {
                libro[i].toString();
            }
        }

    }
}
