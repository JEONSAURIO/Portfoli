package UF3;

import java.io.File;
import java.util.*;

public class EJ10_1 {

    public static void main(String[] args) {

        File ruta = new File("c:\\ficheros");
        File fichero = new File("c:\\ficheros\\asdasd.txt");
        File nombre = new File("c:\\ficheros\\hola.txt");
        ruta.mkdir();

        System.out.println(ruta.list());
        fichero.renameTo(nombre);
        System.out.println(ruta.list());

    }
}
