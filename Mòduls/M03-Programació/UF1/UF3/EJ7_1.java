package UF3;

import java.io.File;
import java.util.*;

public class EJ7_1 {

    public static void main(String[] args) {

        File ruta = new File("c:/ficheros");
        ruta.mkdir();
        
        if (ruta.length() >= 2) {
            System.out.println(ruta.list());
        }
       
    }
}
