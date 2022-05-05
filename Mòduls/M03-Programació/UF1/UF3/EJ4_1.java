package UF3;

import java.io.File;
import java.util.*;

public class EJ4_1 {

    public static void main(String[] args) {

        File ruta = new File("c:/ficheros");
        ruta.mkdir();
        if (ruta.isDirectory()) {
            System.out.println("Es una carpeta");
        } else if (ruta.isFile()) {
            System.out.println("Es un fichero");
        }
    }
}
