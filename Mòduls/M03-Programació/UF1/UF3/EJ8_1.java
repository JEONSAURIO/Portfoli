package UF3;

import java.io.File;
import java.util.*;

public class EJ8_1 {

    public static void main(String[] args) {

        File ruta = new File("c:/ficheros");
        ruta.mkdir();

        System.out.println(ruta.getAbsolutePath());
        System.out.println(ruta.lastModified());
        System.out.println(ruta.length());

    }
}
