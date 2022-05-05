package UF3;

import java.io.File;
import java.util.*;

public class EJ12_1 {

    public static void main(String[] args) {

        File ruta = new File("c:\\ficheros");
        File fichero = new File("c:\\ficheros\\asdasd.txt");
        ruta.mkdir();

        nomFitxer(fichero);
        recullDirectori(fichero);
        Existe(fichero); 
        
    }

    public static void nomFitxer(File fichero) {
        String nombre = fichero.getName();
        System.out.println(nombre);
    }

    public static void recullDirectori(File fichero) {
        String carpeta = fichero.getParent();
        System.out.println(carpeta);
    }

    public static void Existe(File fichero) {
        if (fichero.exists()) {
            System.out.println("El fichero existe");
        }
    }
}
