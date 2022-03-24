package Bloque6;

import java.util.Scanner;

public class Bloque6_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inSec = new Scanner(System.in);

        classEmp[] empleado = new classEmp[2];

        for (int i = 0; i < empleado.length; i++) {
            System.out.println("Introduce Nombre : ");
            String Nombre = inSec.nextLine();

            System.out.println("Introduce calle : ");
            String Calle = inSec.nextLine();

            System.out.println("Introduce numero : ");
            String Numero = inSec.nextLine();

            System.out.println("Introduce código postal : ");
            String CodPos = inSec.nextLine();

            System.out.println("Introduce la ciudad : ");
            String Ciudad = in.nextLine();

            System.out.println("Introduce provincia : ");
            String Provincia = in.nextLine();


        }
       
        }

    }

