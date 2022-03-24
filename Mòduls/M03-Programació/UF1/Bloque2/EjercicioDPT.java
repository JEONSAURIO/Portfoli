package Bloque2;

import java.util.Scanner;

public class EjercicioDPT {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double distancia, km, velocidadm, tiempo, velocidadc, hora;

//Indicamos las variables como nos ha dicho el enunciado del ejercicio//
        System.out.println("Indica distancia entre las dos camaras ");
        distancia = in.nextDouble();

        System.out.println("Indica la velocidad máxima permitida en el tramo ");
        velocidadm = in.nextDouble();

        System.out.println("Indica los segundos que ha tardado el coche en recorrer el tramo");
        tiempo = in.nextDouble();
//Pasamos los metros de la distancia a KM y los segundos a Horas//
        distancia = distancia / 1000;
        tiempo = tiempo / 3600;
        velocidadc = distancia / tiempo;

        if (velocidadc > velocidadm * 1.2) {
            System.out.println("puntos");
        } else if (velocidadc > velocidadm) {
            System.out.println("multa");
        } else {
            System.out.println("ok");
        }
    }
}
