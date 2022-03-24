package Bloque6;

import java.util.Scanner;

public class classCine {

    private String director;
    private String titulo;
    private String tipo;

    public classCine() {
        this.director = "";
        this.titulo = "";
        this.tipo = "";
    }

    public classCine(String dir, String tit, String tip) {
        this.director = dir;
        this.titulo = tit;
        this.tipo = tip;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void imprime() {
        System.out.println("Director: " + this.director);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Tipo: " + this.tipo);

    }

}
