package Bloque6;

import java.util.Scanner;

public class classBL71 {

    private String nombre;
    private int edad;
    private String telefon;
    private String departament;

    public classBL71() {
    }

    public classBL71(String nombre, int edad, String telefon, String departament) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefon = telefon;
        this.departament = departament;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        Scanner in = new Scanner(System.in);

        telefon = telefon.replace("-", "");
        telefon = telefon.replace(" ", "");
        telefon = telefon.replace(".", "");

        while (!checkTelefono(telefon)) {
            System.out.println("Nuevo telefono: ");
            String nuevoTel = in.nextLine();
        }
        this.telefon = telefon;
    }

    public boolean checkTelefono(String telefon) {

        if (telefon.length() != 9) {
            System.out.println("Número no válido");
            return false;
        }

        char[] phoneChar = telefon.toCharArray();
        for (int i = 0; i < phoneChar.length; i++) {
            if (!Character.isDigit(phoneChar[i])) {
                return false;
            }
        }
        return true;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

}
