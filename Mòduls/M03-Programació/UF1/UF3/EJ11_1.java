package UF3;

import java.io.File;
import java.util.*;

public class EJ11_1 {

    public static void main(String[] args) {

        File ruta = new File("c:\\ficheros");
        File[] fichero = ruta.listFiles();
        ruta.mkdir();
        
        for (int i = 0; i < fichero.length; i++) {
             if (fichero[i].isFile()) {
            System.out.println("Es un fichero : " + fichero[i] );
        }
             if (fichero[i].isDirectory()) {
                 System.out.println("Es un directorio: " + fichero[i]);
            }
        }
       
    }
}
