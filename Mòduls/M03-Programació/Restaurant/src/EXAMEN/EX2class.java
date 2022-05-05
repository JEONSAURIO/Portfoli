package EXAMEN;

import java.util.Scanner;

public class EX2class {

    private String Pais;
    private String Region;
    private int temperatura;
    private float presionAtm;

    public EX2class() {
    }

    public EX2class(String Pais, String Region, int temperatura, float presionAtm) {
        this.Pais = Pais;
        this.Region = Region;
        this.temperatura = temperatura;
        this.presionAtm = presionAtm;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public float getPresionAtm() {
        return presionAtm;
    }

    public void setPresionAtm(float presionAtm) {
        this.presionAtm = presionAtm;
    }
@Override
    public String toString() {
        return "{" + "Pais=" + Pais + ", Region=" + Region + ", temperatura=" + temperatura + ", presionAtm=" + presionAtm + '}';
    }
    
}

