package Bloque6;

import java.util.Scanner;

public class classEmp {

    private String Nombre;
    private String Calle;
    private int Numero;
    private int CodPos;
    private String Ciudad;
    private String Provincia;

    public classEmp() {
        this.Nombre = "";
        this.Calle = "";
        this.Numero = 0;
        this.CodPos = 0;
        this.Ciudad = "";
        this.Provincia = "";
    }


    public classEmp(String Nombre, String Calle, int Numero, int CodPos, String Ciudad, String Provincia) {
        this.Nombre = Nombre;
        this.Calle = Calle;
        this.Numero = Numero;
        this.CodPos = CodPos;
        this.Ciudad = Ciudad;
        this.Provincia = Provincia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getCodPos() {
        return CodPos;
    }

    public void setCodPos(int CodPos) {
        this.CodPos = CodPos;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public void imprime() {

    }

}
