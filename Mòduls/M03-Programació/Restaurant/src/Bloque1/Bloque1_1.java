package Bloque1;

import java.util.Scanner;

public class Bloque1_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int intentos = 0;

        boolean ok = false;

        while ((ok == false) && (intentos <= 3)) {
            System.out.println("Introduce el usuario");
            String usuario = in.nextLine();
            System.out.println("Introduce la contraseña");
            String contra = in.nextLine();

            if (("jeon".equals(usuario)) && ("hola".equals(contra))) {
                ok = true;
                System.out.println("Ok. Has entrado");
                System.out.println("Bienvenido " + usuario);
            } else {
                System.out.println("Los datos no son correctos, vuelve a intentarlo");
                intentos++;
                if (intentos == 3) {
                    System.out.println("Se han acabado tus intentos, adios.");
                }
            }

        }

    }
}
