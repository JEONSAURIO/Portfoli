package UF3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EJ1_2 {

    public static void main(String[] args) {

        try {
            String contenido;
            Filereader archivo = new Filereader("C:\\Users\\Jeonsaurio\\Desktop\\GS DAM\\M03\\Ficheros\\resultats.txt");
            BufferedReader lectura = new BufferedReader(archivo);
            while (contenido = lectura.readLine() != null) {
                System.out.println(contenido);
            }
        } catch (FileNotFoundException a) {
            System.out.println("Fichero no encontrado");
            System.out.println(a.getMessage());
        }

    }
}
