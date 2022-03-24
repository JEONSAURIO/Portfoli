package Bloque5;

import java.util.Scanner;

public class tmpClass {

    private String nombre;
    private int edad;
    private char sexo;

    public tmpClass() {
        this.nombre = " ";
        this.edad = 0;
        this.sexo = ' ';
    }

    public tmpClass(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {

        Scanner in = new Scanner(System.in);
        while (sexo != 'h' && sexo != 'm') {
            System.out.println("ERROR, Vuelve a probar");
            sexo = in.nextLine().charAt(0);
        }
        this.sexo = sexo;
    }

    public void AumentaEdad() {
        this.edad = this.edad + 1;
    }

    public long SegundosVivo() {
        return this.edad * 365 * 18 * 3600;
    }
}
