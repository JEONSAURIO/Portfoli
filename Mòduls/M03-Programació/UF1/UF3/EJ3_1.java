package UF3;

import java.io.File;
import java.util.*;

public class EJ3_1 {

    public static void main(String[] args) {

        File ruta = new File("c:/ficheros");
        ruta.mkdir();
        if (ruta.canRead()) {
            System.out.println("Se puede leer");
        } else {
            System.out.println("No se puede leer");
        }
        if (ruta.canWrite()) {
            System.out.println("Se puede escribir");
        } else {
            System.out.println("No se puede escribir");
        }
    }
}
