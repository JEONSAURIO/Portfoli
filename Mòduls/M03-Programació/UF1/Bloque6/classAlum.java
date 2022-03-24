package Bloque6;

import java.util.Scanner;

public class classAlum {

    private int biologia;
    private int mates;
    private int geografia;
    private int ingles;

    public classAlum() {
    }

    public classAlum(int biologia, int mates, int geografia, int ingles) {
        this.biologia = biologia;
        this.mates = mates;
        this.geografia = geografia;
        this.ingles = ingles;
    }

    public int getBiologia() {
        return biologia;
    }

    public void setBiologia(int biologia) {
        this.biologia = biologia;
    }

    public int getMates() {
        return mates;
    }

    public void setMates(int mates) {
        this.mates = mates;
    }

    public int getGeografia() {
        return geografia;
    }

    public void setGeografia(int geografia) {
        this.geografia = geografia;
    }

    public int getIngles() {
        return ingles;
    }

    public void setIngles(int ingles) {
        this.ingles = ingles;
    }



}
