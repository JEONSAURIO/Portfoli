package UF3;

import java.io.File;
import java.util.*;

public class EJ9_1 {

    public static void main(String[] args) {

        File ruta = new File("c:/ficheros");
        File fichero = new File("c:/ficheros/asdasd.txt");

        if (ruta.exists()) {
            ruta.delete();
            fichero.delete();
            System.out.println("Borrando ruta existente");
        } else {
            ruta.mkdir();
            System.out.println("Creando ruta NO existente");
        }

    }
}
