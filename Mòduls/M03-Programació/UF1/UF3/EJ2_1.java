package UF3;

import java.io.File;
import java.util.*;

public class EJ2_1 {

    public static void main(String[] args) {

        File ruta = new File("c:/ficheros");
        ruta.mkdir();
        if (ruta.exists()) {
            System.out.println("Existe");
        } else {
            System.out.println("No existe");
        }
    }
}
