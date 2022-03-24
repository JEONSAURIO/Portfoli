package Bloque6;

import java.util.Scanner;

public class classLibro {

    private String ISBN;
    private String titulo;
    private String autor;
    private String editorial;
    private int numLib;
    private double precio;

    public classLibro() {
        this.ISBN = "";
        this.titulo = "";
        this.autor = "";
        this.editorial = "";
        this.numLib = 0;
        this.precio = 0;
    }

    public classLibro(String isbn, String tit, String aut, String ed, int NL, double pr) {
        this.ISBN = isbn;
        this.titulo = tit;
        this.autor = aut;
        this.editorial = ed;
        this.numLib = NL;
        this.precio = pr;
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
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
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the numLib
     */
    public int getNumLib() {
        return numLib;
    }

    /**
     * @param numLib the numLib to set
     */
    public void setNumLib(int numLib) {
        this.numLib = numLib;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void imprime() {
        System.out.printf("ISBN : \t" + this.ISBN);
        System.out.println("");
        System.out.printf("Titulo : \t" + this.titulo);
        System.out.println("");
        System.out.printf("Autor : \t" + this.autor);
        System.out.println("");
        System.out.printf("Editorial : \t" + this.editorial);
        System.out.println("");
        System.out.printf("Numero de libros en la tienda : \t %d", this.numLib);
        System.out.println("");
        System.out.printf("Precio : \t %.2f", this.precio);
        System.out.println("");

    }

}
