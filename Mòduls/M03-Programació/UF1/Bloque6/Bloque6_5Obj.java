package Bloque6;

import java.util.Scanner;

public class Bloque6_5Obj {

  
    public static final int materias = 4;
    public static final int alumnos = 5;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        classAlum[] notas = new classAlum[alumnos];
        llena(notas);
        medMat(notas);
        medAlm(notas);
    }

    public static void medMat(classAlum[] calificaciones) {
        int suma = 0;
        double mitjana = 0;
        for (int i = 0; i < materias; i++) {
            suma = 0;
            for (int j = 0; j < alumnos; j++) {
                if (i == 0) suma+= calificaciones[i].getIngles();
                if (i == 1) suma+= calificaciones[i].getBiologia();
                if (i == 2) suma+= calificaciones[i].getGeografia();
                if (i == 3) suma+= calificaciones[i].getMates();
            }
            mitjana = (double) suma / alumnos;
            System.out.println(" Mediana materia" + i + ": " + mitjana);
        }
    }

    public static void medAlm(classAlum[] calificaciones) {
        int suma = 0;
        double mitjana = 0; 
        for (int i = 0; i < alumnos; i++) {

                suma += calificaciones[i].getIngles() + calificaciones[i].getBiologia()
                        + calificaciones[i].getGeografia() + calificaciones[i].getMates();
            
            mitjana = (double) suma / materias;
            System.out.println(" Mediana alumno " + i + ": " + mitjana);
            suma = 0;
        }
    }

    public static void llena(classAlum[] calificaciones) {
        for (int i = 0; i < alumnos; i++) {
            
                calificaciones[i] = new classAlum(((int)Math.random() * 10),
                ((int)Math.random() * 10),
                ((int)Math.random() * 10),
                ((int)Math.random() * 10));
            
            System.out.println("");
        }
    }
}
