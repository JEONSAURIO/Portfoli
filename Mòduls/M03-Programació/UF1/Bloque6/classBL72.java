package Bloque6;

import java.util.Scanner;

public class classBL72 {

    private int horas;
    private double sueldo;
    private String codigo;

    public classBL72() {
    }

    public classBL72(int horas, double sueldo, String codigo) {
        this.horas = horas;
        this.sueldo = sueldo;
        this.codigo = codigo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
