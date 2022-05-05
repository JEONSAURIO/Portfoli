package Bloque4;

import java.util.Scanner;

public class classA {

    private String nom;
    private String NIF;
    private String correu;
    private double despesaFetaAcumulada;
    private int percentatgeDescompte;

    public classA() {
    }

    public classA(String nom, String NIF, String correu, double despesaFetaAcumulada, int percentatgeDescompte) {
        this.nom = nom;
        this.NIF = NIF;
        this.correu = correu;
        this.despesaFetaAcumulada = despesaFetaAcumulada;
        this.percentatgeDescompte = percentatgeDescompte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getCorreu() {
        return correu;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }

    public double getDespesaFetaAcumulada() {
        return despesaFetaAcumulada;
    }

    public void setDespesaFetaAcumulada(float despesaFetaAcumulada) {
        this.despesaFetaAcumulada = despesaFetaAcumulada;
    }

    public int getPercentatgeDescompte() {
        return percentatgeDescompte;
    }

    public void setPercentatgeDescompte(int percentatgeDescompte) {
        this.percentatgeDescompte = percentatgeDescompte;
    }

    




}
