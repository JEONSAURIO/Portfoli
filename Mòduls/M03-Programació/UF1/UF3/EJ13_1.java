package UF3;

import java.io.File;
import java.util.*;

public class EJ13_1 {

    public static void main(String[] args) {

        File ruta = new File("c:\\ficheros");
        File fichero = new File("c:\\ficheros\\asdasd.pdf");
        File fichero2 = new File("c:\\ficheros\\asdasd.txt");
        ruta.mkdir();

        boolean remombrado = fichero.renameTo(fichero2);
    }

}
