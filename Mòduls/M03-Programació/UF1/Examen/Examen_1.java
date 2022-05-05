package Examen;

import java.util.Scanner;

public class Examen_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner ina = new Scanner(System.in);

        /*Recogemos los datos que nos pide el ejercicio*/
        int edad = 0, total = 0, sumaT = 0, sumaH = 0, sumaM = 0, hombres = 0, mujeres = 0,
                jovenes = 0, adultos = 0, gadulto = 0, anciano = 0;

        double porcentajeM = 0, porcentajeF = 0, mediaM = 0, mediaF = 0;
        boolean fin = true;
        while (fin = true) {

            System.out.println("Añade tu nombre");
            String nombre = ina.nextLine();
            total++;
            if (nombre.equals("final")) {
                fin = false;
                break;
            }
            System.out.println("Tu sexo? (M/F)");
            String sexo = ina.nextLine();

            System.out.println("Y tu edad?");
            edad = in.nextInt();

            System.out.println(nombre + edad);

            /*Aquí clasificamos los datos recibidos por hombre,mujer y la edad a qué grupo pertenece, y hacemos las operaciones */
            if (sexo.equals("M")) {
                hombres++;
                sumaH += edad;
                mediaM = sumaH / hombres;
                
            } else if (sexo.equals("F")) {
                mujeres++;
                sumaM += edad;
                mediaF = sumaM / mujeres;
               
            }
            if ((edad >= 20) && (edad <= 40)) {
                jovenes++;
            } else if ((edad > 40) && (edad <= 60)) {
                adultos++;
            } else if ((edad > 60) && (edad <= 80)) {
                gadulto++;
            } else {
                anciano++;
            }

             
        }
porcentajeM = (hombres / total) *100;
 porcentajeF = (mujeres / total) * 100;
        /*Los resultados*/
        System.out.printf("El porcentaje de hombres ha sido un %.2f y el de mujeres un %.2f \n", porcentajeM, porcentajeF);
        System.out.printf("La media de la edad de los hombres ha sido de %.2f y la media de las mujeres de %.2f \n", mediaM, mediaF);
        System.out.printf("De entre 20 a 40 años hay %d personas, de 41 a 60 %d, entre 61 y 80 %d y finalmente, de más de 80 hay %d \n", jovenes, adultos, gadulto, anciano);
    }
}
