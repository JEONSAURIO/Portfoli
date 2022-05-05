package UF3;

import java.io.File;
import java.util.*;

public class EJ6_1 {

    public static void main(String[] args) {

        File ruta = new File("c:/ficheros");

        if (ruta.exists()) {
            ruta.delete();
            System.out.println("Borrando ruta existente");
        } else {
            ruta.mkdir();
            System.out.println("Creando ruta NO existente");
        }
    }
}
